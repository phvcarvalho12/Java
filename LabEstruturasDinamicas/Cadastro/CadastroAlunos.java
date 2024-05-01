import java.io.Serializable;
import eds.IArmazenador;
import eds.ListaArray;
import aluno.Aluno;
import aluno.Disciplina;
import entrada.IEntrada;
import entrada.EntradaGui;


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
    //Insere aluno no cadastro
    public void inserir(){ 

        Aluno a = criaAluno();
        if(a != null){
            String ra = a.getRA();
            int i = 0;
            int aux = 0;
            if(a != null)
                do{

                if(!verificaTdsRA(ra))
                    {arm.adicionar(a); aux = 1; dados.msgAlunoCad();}
                    else{
                        dados.msgAlunoJaCad(); aux = 1;}
                    i++;
                }while(i < arm.getQtd() && aux != 1);
        }

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
        Object item;
        while(i < arm.getQtd()){
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

    public Aluno criaAluno(){ //cria o objeto aluno contendo todas as informacoes

        String ra = dados.lerRA();
        Aluno aluno = null;
        String nome = null;
        int idade = 0;
        int serie = 0;
        int qtd = 0;

        Disciplina disc[] = null;
        if(!verificaTdsRA(ra)){ //apenas criar aluno se nao houver aluno com o ra inserido

            if(ra != null)
                nome =  dados.lerNome();

            if(nome != null)
                idade = dados.lerIdade();

            if(idade != -1 && nome != null)
                serie = dados.lerSerie();

            if(idade != -1 && nome != null && serie != -1)
                qtd = dados.lerQtd();

            if(idade != -1 && nome != null && serie != -1 && qtd != -1)
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

    public void escolha() //menu de escolhas a serem realizadas
    {
        
        char op;
        do{
            op = dados.opcao();
            switch(op){
                case 'I', 'i': {inserir(); break;}
                case 'R', 'r':{retirarAluno(); break;}
                case 'L', 'l':{listar(); break;}
                case 'S', 's':{break;}
                default: {dados.msgOP(); break;}
            }
        } while (op != 'S' && op != 's');
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
}

