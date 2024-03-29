package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//ler o primeiro e segundo numero, fazer uma operacao
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operacao: ");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		entrada.close();
		
		/*double a;
		double b;
		
		Scanner entrada = new String(System.in);
		
		System.out.print("Digite o primero numero: ");
		double valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo numero: ");
		double valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Qual sera a operacao? ");
		String operacao = entrada.next();
		
		double resultado = valor1 operacao valor2;
		
		System.out.println(valor1 operacao valor2 = resultado);
		
		entrada.close();
		*/
	}
}
