package beecrowd;

import java.util.Scanner;

public class FatorialSimples {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int n = entrada.nextInt();
		if (n < 0 || n > 13) {
			return;
		}
		
		int fatorial = 1;
//		int fatorial = 0;
//		for(int i = n; i > 0; i--) {
//			fatorial = fatorial + (n * (i-1));
//		}
		for(int i = n; i > 0; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		entrada.close();
	}
}
