 

public class Fatorial {
    public int calcularFatorial (int a) {
        if(a % 1 == 0){
            for(int i = 2; i <= a; i++){
                a = a + (a * (a - i));
            }
        }
        else{
            System.out.println("Erro, tente novamente");
        }
        return a; 
    }
}
