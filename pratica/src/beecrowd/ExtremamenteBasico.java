package beecrowd;

import java.util.Scanner;

public class ExtremamenteBasico {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor para A: ");
		int A = entrada.nextInt();
		System.out.println("Digite um valor para B:");
		int B = entrada.nextInt();

		entrada.close();
		
		int X = A + B;
		
		System.out.println("X = " + X);

	}
}
