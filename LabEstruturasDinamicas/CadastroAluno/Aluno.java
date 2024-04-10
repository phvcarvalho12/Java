package CadastroAluno;


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
    Disciplina [] disciplinas;
    int semestre;
    
    //Contrutor
    Aluno(String nome, int idade, String rg, String ra, String curso, Disciplina disc[], int semestre){
        // Aciona o construtor da classe pai (Pessoa)
        super(nome, idade, rg);
        this.ra = ra;
        this.curso = curso;
        this.disciplinas = disc;
        this.semestre = semestre;
    }
    
}
