package LED;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a operacao: ");
		float n1 = entrada.nextFloat();
		char operacao = entrada.next().charAt(0);
		float n2 = entrada.nextFloat();
		float resultado = 0;
		
		switch(operacao) {
		case '+':
			resultado = n1 + n2;
			System.out.printf("\n%.2f + %.2f = %.2f", n1, n2, resultado);
			break;
		case '-':
			resultado = n1 - n2;
			System.out.printf("\n%.2f - %.2f = %.2f", n1, n2, resultado);
			break;
		case '*':
			resultado = n1 * n2;
			System.out.printf("\n%.2f * %.2f = %.2f", n1, n2, resultado);
			break;
		case '/':
			resultado = n1 / n2;
			System.out.printf("\n%.2f / %.2f = %.2f", n1, n2, resultado);
			break;
		case '%':
			resultado = n1 % n2;
			System.out.printf("\n%.2f / %.2f = %.2f", n1, n2, resultado);
			break;
		}
		entrada.close();	
	}
}
