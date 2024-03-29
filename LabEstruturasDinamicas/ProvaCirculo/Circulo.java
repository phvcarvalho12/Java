package ProvaCirculo;

//package ProvaCirculo;

 

public class Circulo {

    public void resultadosCirculo(double x, double y, double raio){
            //System.out.printf("%.2f  %.2f \n", x, y);
            System.out.printf("A area vale %.2f\n",calcularArea(raio));
            System.out.printf("O perimetro vale %.2f\n",calcularPerimetro(raio));
    }
    
    public double calcularArea(double raio){
            double pi = Math.PI;
            double resultado = (raio * raio) * pi;
            return resultado;
    }
    
    public double calcularPerimetro(double raio){
            double pi = Math.PI;
            double resultado = 2 * pi * raio;
            return resultado;
    }
 }

