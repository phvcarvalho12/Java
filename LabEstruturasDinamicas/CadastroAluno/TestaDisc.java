package CadastroAluno;

public class TestaDisc {
     public static void main(String[] args) {
         //Criacao de array em java
             /**
              *
              */
             Disciplina disc[] = new Disciplina[3];
     
             disc[0] = new Disciplina("LED", "Lab Est Din", 5.5f);
             disc[1] = new Disciplina("LIC", "Lab Est", 7.4f);
             disc[2] = new Disciplina("FOO", "Fod", 8.2f);
             
             for(int i = 0; i < disc.length; i++)
                 System.out.println(disc[i]);     
         }    

}

