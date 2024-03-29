package ProvaCirculo;

import java.util.Scanner;

public class Aplicacao{
        
        public static void main(System args[]){
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ponto x e y para o ponto central(x \0 y): ");
        double x = entrada.nextDouble();
        double y = entrada.nextDouble();
        
        System.out.println("Digite o valor do raio: ");
        double raio = entrada.nextDouble();
        entrada.close();
        
        Circulo circulo = new Circulo();
        Ponto pt = new Ponto();
        
        pt.ponto(x, y);
        
        circulo.resultadosCirculo(x, y, raio);
        circulo.calcularArea(raio);
        circulo.calcularPerimetro(raio);
        
                   
        }
}
