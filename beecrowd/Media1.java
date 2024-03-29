package beecrowd;

import java.util.Scanner;

public class Media1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nota A: ");
		double A = entrada.nextDouble();
		System.out.println("Nota B: ");
		double B = entrada.nextDouble();
		
		entrada.close();
		
		if (A < 0.0 || A > 10.0 || B < 0.0 || B > 10.0)
			return;
		
		A = A * 0.35;
		B = B * 0.75;
		
		double media = A + B;
		
		System.out.printf("MEDIA = %.5f\n", media);
	}
}
