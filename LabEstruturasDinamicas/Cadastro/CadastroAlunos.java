package Cadastro;

import java.io.Serializable;
import eds.IArmazenador;
import eds.ListaArray;
import aluno.Aluno;
import aluno.Disciplina;
import entrada.IEntrada;
import entrada.EntradaGui;
import javax.swing.JFrame;

public class CadastroAlunos implements Serializable{
    // variaveis de instância
    //private Aluno cad[];
    IArmazenador arm;
    //troca de interface do programa 

    //private IEntrada dados = new EntradaConsole();
    private IEntrada dados = new EntradaGui();
    
    /**
     * Construtor para objetos da classe CadastroAlunos
     */
    public CadastroAlunos(){ //construtor da variavel armazenadora
        //this.arm = new ListaLigadaSimples();
        this.arm = new ListaArray();
        //this.arm = new VetDin();     
    }
    public CadastroAlunos(int x){
        
    }
    //Insere aluno no cadastro
    public void inserir(String ra , String nome , int idade , int serie , int qtd)
    {   
        Aluno a = criaAluno(ra , nome , idade , serie , qtd);
        if(a != null){
            ra = a.getRA();
            int i = 0;
            int aux = 0;
            if(a != null){

                    if(!verificaTdsRA(ra))
                    {arm.adicionar(a); aux = 1; dados.msgAlunoCad();}
                    else{
                        dados.msgAlunoJaCad(); aux = 1;}
                    i++;
            }
        }
        int x = 1;    
    }     
    //Remove aluno do cadastro
    public boolean retirar(){
        int i = 0;
        int aux = 0;
        boolean resp = false;

        String ra = dados.lerRA();

        while(i < arm.getQtd() && aux != 1){

            if(verificaRA(ra, i)) //verifica se existe o ra fornecido a cada posicao
            {arm.remover(i); aux = 1; resp = true;}

            i++;

        }

        return resp;
    }
    //lista os alunos cadastrados
    public void listar(){
        int i = 0;
        int j = arm.getQtd();
        Object item;
        while(i < j){
            item = arm.buscar(i);
            if(item != null)
                dados.listarAlunos(item);

            i++;

        }

        if(i == 0) //se i == 0 nao ha alunos no cadastro
            dados.msgNaoAlunos();

    }
    //Verifica se o Ra ja foi cadastrado
    private boolean verificaRA(String ra, int i){
        boolean resp = false;

        Aluno aluno = (Aluno)arm.buscar(i);

        if(!arm.estaVazia())
            if(aluno.getRA().equals(ra))
                resp = true;

        return resp;
    }

    private boolean verificaTdsRA(String ra){ //compara o ra fornecido com todos os ras armazenados
        boolean resp = false;
        if(!arm.estaVazia())
            for(int i = 0; i < arm.getQtd(); i++){
                Aluno aluno = (Aluno)arm.buscar(i);

                if(aluno.getRA().equals(ra))
                    resp = true;

            }
        return resp;
    }

    public Aluno criaAluno(String ra , String nome , int idade , int serie , int qtd){ //cria o objeto aluno contendo todas as informacoes
        Aluno aluno = null;
        /*String ra = dados.lerRA();
        String nome = null;
        int idade = 0;
        int serie = 0;
        int qtd = 0;
        */
        Disciplina disc[] = null;
        if(!verificaTdsRA(ra)){ //apenas criar aluno se nao houver aluno com o ra inserido
            disc = criaDisc(qtd);
            if(idade != -1 && nome != null && serie != -1 && qtd != -1 && disc != null)
                aluno = new Aluno(nome,idade,ra,serie,disc);
            else
                aluno = null;
        }
        else
            dados.msgAlunoJaCad();
        return aluno;
    }

    public void retirarAluno(){ //verifica se o aluno foi ou nao retirado ou se existem alunos a serem retirados

        if(!arm.estaVazia()){
            if(retirar())
                dados.msgAlunoRet();
            else
                dados.msgAlunoNEnc();
        }
        else
            dados.msgNaoAlunos();

    }

    public void escolha(String op) //menu de escolhas a serem realizadas
    {
        //do{
            switch(op){
                case "I", "i": {
                    Janela inserir = new Janela("inserir");
                    inserir.setVisible(true);
                    inserir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    break;}
                case "R", "r":{retirarAluno(); break;}
                case "L", "l":{listar(); break;}
                case "1": {salvarLista(); break;}
                case "2": {carregarDados(); break;}
                case "S", "s":{break;}
                default: {dados.msgOP(); break;}
            }
        //} while (op != "S" && op != "s");
    }

    public Disciplina [] criaDisc(int qtde){ //cria o vetor contendo as disciplinas e as notas
        Disciplina disc[] = new Disciplina[qtde];

        int i = 0;
        String nomeD = null;
        float notaD = 0;
        int aux = 0;

        while(i < qtde && aux != 1)
        {
            nomeD = dados.nomeDaDisc();
            if(nomeD == null) {aux = 1; disc = null;}
            else{
                notaD = dados.lerNota();
                if(notaD == -1) {aux = 1; disc = null;}
                else
                    disc[i] = new Disciplina(nomeD, notaD);
                i++;
            }
        }

        return disc;
    }

    public void salvarLista(){//salva alunos na memoria
        String nome = null;
        if(!arm.estaVazia()){ // se houverem alunos no cadastro pode ser salvo
            ArquivoBinario ab = new ArquivoBinario();
            nome = dados.nomeArq();
            if(nome != null){
                nome = nome + ".bin";
                ab.gravarObj(arm,nome);
                dados.msgArqSalv();
            }   
        }   else  
            dados.msgNaoAlunos();

        if(nome != null){

            ArquivoBinario ab= new ArquivoBinario();
            ab.gravarObj(arm,nome);
        }
    }

    public void carregarDados(){ //carrega alunos salvos
        ArquivoBinario ab= new ArquivoBinario(); 
        String nome = dados.nomeArq();
        if(nome != null){
            nome = nome + ".bin";
            IArmazenador aux = (IArmazenador) ab.lerObj(nome);
            if(aux!=null){ //carregar alunos somente se existir algo a ser carregado
                dados.msgArqLido();
                arm = (IArmazenador) ab.lerObj(nome);
            }else dados.naoDados();
        }
    }
}

