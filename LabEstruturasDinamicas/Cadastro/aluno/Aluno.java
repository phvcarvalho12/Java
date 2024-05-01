package aluno;
//import java.io.Serializable;
//import javax.swing.JOptionPane;
import pessoa.Pessoa;

public class Aluno extends Pessoa{
    // Atributos
    String ra;
    int serie;
    Disciplina disc[];

    /**
     * Aluno Construtor para iniciar dados do aluno
     *
     * @param nome String, nome do aluno
     * @param idade int, idade do aluno
     * @param ra String, ra do aluno
     * @param serie int, serie do aluno
     * @param disc array de Disciplinas
     */
    public Aluno(String nome, int idade, String ra, int serie, Disciplina disc[]){
        super (nome, idade);
        setRa(ra);
        setSerie(serie);
        setDisc(disc);
    }
    //Armazena RA
    private void setRa(String ra){
        this.ra = ra;
    }
    //Armazena Serie
    private void setSerie(int serie){
        this.serie = serie;
    }
    //Armazena Disciplina
    private void setDisc(Disciplina disc[]){
        this.disc = disc;
    }
    //retorna o RA armazenado
    public String getRA(){
        return this.ra;
    }
    //retorna a serie armazenada
    public int getSerie(){
        return this.serie;
    }
    
    public String toString(){
    String b = "";
        for(int i = 0; i < disc.length ; i++)
        b = b + "Disciplina: " + disc[i].getNomeDisc() + " Nota: " + disc[i].getNota() + "\n";

        String s = toStringP() + "\nRA: " +  getRA() + "\nSerie: " + getSerie() + "\n" + b;
        return s; 
    }
}



