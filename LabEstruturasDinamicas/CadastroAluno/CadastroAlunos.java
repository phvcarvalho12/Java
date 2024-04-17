
/**
 * Representa um cadastro de alunos.
 * 
 * @author Pedro Carvalho 
 * @version 27/03/2023
 */
public class CadastroAlunos {
    // variáveis de instância
    private Aluno armazenador[]; // armazenador de alunos

    /**
     * Construtor para objetos da classe CadastroAlunos
     */
    public CadastroAlunos(int qtde) {
        // inicializa variáveis de instância
        armazenador = new Aluno[qtde];
        
        for(int i = 0; i < qtde; i++){
            armazenador[i] = null;
        }
    }
    
    /**
     * Método inserir
     *
     * @param Um parâmetro
     * @return O valor de retorno
     */
    public boolean inserir(Aluno a){
        return true;
    }
    
    /**
     * Método remover
     *
     * @param ra Um parâmetro
     * @return O valor de retorno
     */
    public boolean remover(String ra){
        return true;
    }
    
    /**
     * Método listar
     *
     */
    public void listar(){
        
        
    }
    
    public void mostrarAluno() {
        
    }
}
