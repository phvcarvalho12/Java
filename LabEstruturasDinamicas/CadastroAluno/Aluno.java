
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno extends Pessoa {
    // Atributos do aluno    
    String ra;
    String curso;
    //Disciplinas [] disc;
    int serie;
    
    Aluno(String nome, int idade, String rg, String ra){
        // Aciona o construtor da classe pai (Pessoa)
        super(nome, idade, rg);
        this.ra = ra;
    }
    
}
