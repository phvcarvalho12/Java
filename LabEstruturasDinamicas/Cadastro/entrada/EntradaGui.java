package Cadastro.entrada; 

import javax.swing.JOptionPane;

public class EntradaGui implements IEntrada {
    /**
     * lerNome - entrada de nome (grafica)
     *
     * @return String, nome fornecido
     */
    public String lerNome() {

        String nome = null;
        boolean resp = false;
        do{
            try{ 
                nome = JOptionPane.showInputDialog("Forneca nome: ");

                if (nome == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    resp = true;
                } else if(nome.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve um nome inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nome;
    }

    /**
     * lerIdade - entrada de idade (grafica)
     *
     * @return int, idade fornecida
     */
    public int lerIdade(){ 
        String aux = null;
        int idade = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Forneca idade: ");
                idade = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    idade = -1; resp = true;
                } else if (aux.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve uma idade inserida.\n");
                }else{
                    JOptionPane.showMessageDialog(null,"\nERRO: Insira uma idade valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return idade;
    }

    /**
     * lerNota - entrada de nota (grafica)
     *
     * @return float, nota fornecida
     */
    public float lerNota(){ 
        String aux = null;
        float nota = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Forneca nota: ");
                nota = Float.parseFloat(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    nota = -1;
                    resp = true;
                } else if (aux.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve uma nota inserida.\n");
                }else{
                    JOptionPane.showMessageDialog(null,"\nERRO: Insira uma nota valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                nota = -1;
            resp = true;}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nota;
    }

    /**
     * lerRA - entrada do ra (grafica)
     *
     * @return String, ra fornecido
     */
    public String lerRA(){
        String RA = null;
        boolean resp = false;
        do{
            try{ 
                RA = JOptionPane.showInputDialog("Forneca RA: ");

                if (RA == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    resp = true;
                } else if(RA.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve um RA inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return RA;
    }

    /**
     * lerSerie - entrada da serie (grafica)
     *
     * @return int, serie fornecida
     */
    public int lerSerie(){
        String aux = null;
        int serie = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Forneca serie: ");
                serie = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    serie = -1; resp = true;
                } else if (aux.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve uma serie inserida.\n");}
                else{
                    JOptionPane.showMessageDialog(null,"\nERRO: Insira uma serie valida.\n");
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return serie;
    }
    //Mostra a opcao de escolha que deseja executar
    public char opcao(){

        String op1 = null;
        boolean resp = false;
        char op = 'a';
        do{
            try{ 
                op1 = JOptionPane.showInputDialog("(I) Inserir Aluno\n(R) Remover Aluno\n(L) Listar Alunos\n(1) Salvar Arquivo\n(2) Carregar Arquivo\n(S) Sair");
                
                op = op1.charAt(0);
                
                if (op1 == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                } else if(op1.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Insira uma opcao\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                 op = 's'; resp = true;}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido.\n");
            }
        }  while (!resp);

        return op;
    }
    //Pede a quantidade de disciplanas
    public int lerQtd(){
        String aux = null;
        int qtd = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Quantas disciplinas o aluno possui? ");
                qtd = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    qtd = -1; resp = true;
                } else if (aux.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve uma quantida de disciplinas inserida.\n");
                }else{
                    JOptionPane.showMessageDialog(null,"\nERRO: Insira uma quantida de disciplinas valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
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
                nomeD = JOptionPane.showInputDialog("Forneca nome da Disciplina: ");

                if (nomeD == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    resp = true;
                } else if(nomeD.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve um nome de disciplina inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nomeD;
    }
    
    public void msgNaoAlunos(){
        JOptionPane.showMessageDialog(null,"Nao ha aluno cadastrados");
    }
    
    public void listarAlunos(Object item){
        JOptionPane.showMessageDialog(null, item);
    }
    
    public void msgAlunoCad(){
        JOptionPane.showMessageDialog(null,"\nAluno cadastrado com sucesso!!");
    }
    
    public void msgAlunoJaCad(){
        JOptionPane.showMessageDialog(null,"Aluno ja cadastrado");
    }
    
    public void msgAlunoRet(){
       JOptionPane.showMessageDialog(null,"Aluno retirado.");
    }
    
    public void msgAlunoNEnc(){
        JOptionPane.showMessageDialog(null,"Aluno nao encontrado.");
    }
    
    public void msgOP(){
        JOptionPane.showMessageDialog(null,"\nInsira uma opcao valida.");
    }
    
    public void msgArqSalv(){
    JOptionPane.showMessageDialog(null,"Arquivo salvo com sucesso");
    }
    public void msgArqLido(){
    JOptionPane.showMessageDialog(null,"Arquivo lido com sucesso");
    }
    public void naoDados(){
        JOptionPane.showMessageDialog(null,"Nao ha dados a serem carregados");
    }
    public String nomeArq(){
    String nomeD = null;
        boolean resp = false;
        do{
            try{ 
                nomeD = JOptionPane.showInputDialog("Insira nome do arquivo");

                if (nomeD == null){
                    JOptionPane.showMessageDialog(null,"Operacao cancelada!\n");
                    resp = true;
                } else if(nomeD.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"\nERRO: Nao houve um nome de arquivo inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nomeD;
    }
}
