 

import java.util.Scanner;
//import java.util.IllegalFormatConversionException: null(in java.util.Formatter$FormatSpecifier)

public class AplicacaoCalculadora{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        RaizQuadrada raiz = new RaizQuadrada();
        Seno seno = new Seno();
        Inverter inverter = new Inverter();
        Fatorial fatorial = new Fatorial();

        System.out.print("\nQual implementação você quer usar\n");
        System.out.println("Raiz quadrada = 1");
        System.out.println("Seno = 2");
        System.out.println("Inverter = 3");
        System.out.println("Fatorial = 4");
        int menu = entrada.nextInt();

        if (menu == 4){
            System.out.println("\nDigite um numero o numero desejado: ");
            int xf = entrada.nextInt();
            int resultadof = 0;
            resultadof = fatorial.calcularFatorial(xf);
            System.out.printf("O fatorial do numero %.2f é %.2f", xf, resultadof);
            return;
        }else{
            System.out.println("\nDigite um numero o numero desejado: ");
            double x = entrada.nextDouble();
            double resultado = 0;         

            switch(menu){
                case 1:
                    resultado = raiz.calcularRaiz(x);
                    System.out.printf("A raiz quadrada do numero %.2f é %.2f", x, resultado);
                    break;
                case 2:
                    resultado = seno.calcularSeno(x);
                    System.out.printf("O seno do numero %.2f é %.2f", x, resultado);
                    break;
                case 3:
                    resultado = inverter.calcularInverter(x);
                    System.out.printf("O inverso do numero %.2f é %.2f", x, resultado);
                    break;
                default:
                    System.out.println("\n Erro, tente novamente");
                    break;
            }
        }   

        entrada.close();
    }

}
