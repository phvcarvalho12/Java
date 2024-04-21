import java.util.Scanner;

public class testebit{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c, a;
        do{
            System.out.println("Digite um numero: ");
            a = entrada.nextInt();
        
            c = (a & 1) == 1 ? 1 : 0;
        
            System.out.printf("O numero %d eh %s\n\n", a, (c == 1) ? "impar" : "par");
        
        }while(a != -1);

        entrada.close();
    }
}