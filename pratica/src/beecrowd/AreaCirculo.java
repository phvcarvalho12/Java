package beecrowd;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		double P = 3.14159;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o raio: ");
		double raio = entrada.nextDouble();
		entrada.close();

		double A = P * (raio * raio);
				
		System.out.printf("A=%.4f", A);
		
	}
}
