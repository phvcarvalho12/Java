package entrada; 

/**
 * IEntrada interface para entrada de dados
 * 
 
 para mudar entrada via console ou grafica, mudar na classe: CadastroAlunos
 */

public interface IEntrada {
    // interface ou assinaturas de metodos
    public char opcao();
    public  String lerNome(); 
    public  int lerIdade(); 
    public  float lerNota();
    public String lerRA();
    public int lerSerie();
    //public Disciplina [] lerDisc(int qtde);
    public int lerQtd();
    public String nomeDaDisc();
    public void msgNaoAlunos();
    public void listarAlunos(Object item);
    public void msgAlunoCad();
    public void msgAlunoJaCad();
    public void msgAlunoRet();
    public void msgAlunoNEnc();
    public void msgOP();
}
