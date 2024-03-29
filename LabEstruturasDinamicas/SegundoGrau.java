 

import java.util.Scanner;

public class SegundoGrau {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a operacao de segundo grau: ");

        char aOperacao = entrada.next().charAt(0);//- ou +
        String aAnterior = entrada.next(); //4x² + 8x - 6
        double a;
        if (aOperacao == '-') {
            String aP = aAnterior.replace('x', '.').replace('�', '0'); 
            a = -Double.parseDouble(aP); 
        } else {
            String aP = aAnterior.replace('x', '.').replace('�', '0'); 
            a = Double.parseDouble(aP); 
        }
        

        char bOperacao = entrada.next().charAt(0);
        String bAnterior = entrada.next(); 
        double b;
        if (bOperacao == '-') {
            String bP = bAnterior.replace('x', '.');
            b = -Double.parseDouble(bP);
        } else {
            String bP = bAnterior.replace('x', '.');
            b = Double.parseDouble(bP);
        }

        char cOperacao = entrada.next().charAt(0);
        double c = entrada.nextDouble();
        if (cOperacao == '-') {
            c = -c;
        }

        entrada.close();
        

        double delta = (b * b) - 4 * a * c;

        if (delta < 0) {
            System.out.println("O delta é negativo, portanto não é possível realizar a conta dentro dos reais");
            return;
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (x1 == x2) {
            System.out.println("Como delta é zero, só há uma solução possível");
            System.out.printf("O valor de x é %.2f\n", x1);
            return;
        }

        System.out.printf("O valor do x1 é %.2f e o valor de x2 é %.2f\n", x1, x2);
    }
}
