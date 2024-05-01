package aluno;
import java.io.Serializable;
import txt.Texto;

public class Disciplina implements Serializable{
    private float nota;
    private Texto nomeDisc;

    /**
     * Construtor para objetos da classe Disciplina
     */

    public Disciplina(String nomeDisc, float nota){
        setNomeDisc(nomeDisc);
        setNota(nota);
    }
    //Armazena nome da disciplina
    private void setNomeDisc(String nome){
        this.nomeDisc = new Texto(nome);
    }
    //Retorna nome da disciplina armazenada
    public String getNomeDisc(){
        return this.nomeDisc.getTxt();
    }
    //Armazena nota da disciplina
    private void setNota(float nota){
        this.nota = nota;}
    //Retorna a nota da disciplina armazenada
    public float getNota(){
        return this.nota;
    }
}

