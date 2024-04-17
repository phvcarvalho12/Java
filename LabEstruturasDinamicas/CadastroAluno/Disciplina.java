 

public class Disciplina {
    //variaveis de instancia
    String codDisc;
    Texto nomeDisc;
    float media;

    //Construtor
    Disciplina(String codDisc, String nomeDisc, float media){
        this.codDisc = codDisc;
        this.nomeDisc = new Texto (nomeDisc);
        this.media = media;
    }
    
    public String toString(){
        String s = "\nCod: " + this.codDisc +
                    "\nNome: " + this.nomeDisc +
                    "\nMedia: " + this.media;
        return s;
    } 
}
