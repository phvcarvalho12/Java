package Cadastro.entrada; 

import java.util.Scanner;

public class EntradaConsole implements IEntrada {
    Scanner scan = new Scanner( System.in );

    /**
     * lerIdade - entrada de idade (texto)
     *
     * @return int, idade fornecida
     */    
    public String lerNome(){

        String nome = null;
        boolean resp = false;
        do{
            try{ 
                System.out.print("Forneca nome: ");
                nome = scan.nextLine();

                if (nome == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if(nome.trim().isEmpty()){
                    System.out.println("\nERRO: Nao houve um nome inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nome;
    }

    /**
     * lerIdade - entrada de idade (texto)
     *
     * @return int, idade fornecida
     */
    public int lerIdade(){ 
        String aux = null;
        int idade = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca idade: ");
                aux = scan.nextLine();
                idade = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma idade inserida.\n");
                }else{
                    System.out.println("\nERRO: Insira uma idade valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return idade;
    }

    /**
     * lerNota - entrada de nota (texto)
     *
     * @return float, nota fornecida
     */
    public float lerNota(){ 
        String aux = null;
        float nota = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca nota: ");
                aux = scan.nextLine();
                //nota = Integer.parseInt(aux);
                nota = Float.parseFloat(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma nota inserida.\n");
                }else{
                    System.out.println("\nERRO: Insira uma nota valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nota;
    }

    /**
     * lerRA - entrada do RA (texto)
     *
     * @return String, RA fornecido
     */
    public String lerRA(){
        String RA = null;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca RA: ");
                clearBuffer(scan);
                RA = scan.nextLine();

                if (RA == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");;
                } else if(RA.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um RA inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return RA;
    }
    
    /**
     * lerSerie - entrada de serie (texto)
     *
     * @return int, serie fornecida
     */
    public int lerSerie(){
        String aux = null;
        int serie = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca serie: ");
                aux = scan.nextLine();
                serie = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma serie inserida\n");}
                else{System.out.println("\nERRO: Insira uma serie valida.\n");
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return serie;
    }

    //Mostra a opcao de escolha que deseja executar
    public char opcao(){
        System.out.println("\n------------MENU----------");
        System.out.println("(I) Inserir Aluno");
        System.out.println("(R) Remover Aluno");
        System.out.println("(L) Listar Alunos");
        System.out.println("(1) Salvar Arquivo");
        System.out.println("(2) Carregar Arquivo");
        System.out.println("(S) Sair");
        System.out.println("--------------------------");
        char op = scan.next().charAt(0);
        return op;
    }
    //limpa o buffer do teclado
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    //Pede a quantidade de disciplanas
    public int lerQtd(){
        String aux = null;
        int qtd = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Quantas disciplinas o aluno possui? ");
                aux = scan.nextLine();
                qtd = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma quantidade de disciplinas inserida.\n");
                }else{
                    System.out.println("\nERRO: Insira uma quantidade de disciplinas valida\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return qtd;
    }

    /**
     * lernomeDaDisc - entrada do nome da disciplina (grafica)
     *
     * @return String, nome da disciplina fornecida
     */
    public String nomeDaDisc(){
        String nomeD = null;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca nome da Disciplina: ");
                nomeD = scan.nextLine();

                if (nomeD == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if(nomeD.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um nome de disciplina inserido\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nomeD;
    }
    //metodos que sao apenas mensagens
    public void msgNaoAlunos(){
    System.out.println("Nao ha aluno cadastrados");
    }
    
    public void listarAlunos(Object item){
        System.out.println(item);
    }
    
    public void msgAlunoCad(){
        System.out.println("\nAluno cadastrado com sucesso!!");
    }
    
    public void msgAlunoJaCad(){
        System.out.println("Aluno ja cadastrado");
    }
    
    public void msgAlunoRet(){
        System.out.println("Aluno retirado.");
    }
    
    public void msgAlunoNEnc(){
        System.out.println("Aluno nao encontrado.");
    }
    
    public void msgOP(){
        System.out.println("\nInsira uma opcao valida.");
    }
    
    public void msgArqSalv(){
    System.out.println("Arquivo salvo com sucesso");
    }
    public void msgArqLido(){
    System.out.println("Arquivo lido com sucesso");
    }
    public void naoDados(){
        System.out.println("Nao ha dados a serem carregados");
    }
    public String nomeArq(){
        String nomeD = null;
        boolean resp = false;
        do{
            try{
                System.out.print("Insira nome do arquivo: ");
                clearBuffer(scan);
                nomeD = scan.nextLine();

                if (nomeD == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if(nomeD.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um nome de arquivo inserido\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nomeD;
    }

}
