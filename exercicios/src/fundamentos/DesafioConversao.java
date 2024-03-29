package fundamentos;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioConversao {
	
	public static void main(String[] args) {
		/*
		String sal1 = JOptionPane.
				showInputDialog("Digite o primero salario");
		
		String sal2 = JOptionPane.
				showInputDialog("Digite o segundo salario");
		
		String sal3 = JOptionPane.
				showInputDialog("Digite o terceiro salario");
		
		double numero1 = Double.parseDouble(sal1);
		double numero2 = Double.parseDouble(sal2);
		double numero3 = Double.parseDouble(sal3);
		
		double media = (numero1 + numero2 + numero3)/3;
		
		System.out.printf("A media dos salarios %.2f, %.2f, %.2f eh %.2f", 
				numero1, numero2, numero3, media);
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primero salario: ");
		String valor1 = entrada.next().replace(",", ".");

		System.out.println("Digite o primero salario: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o primero salario: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double sal1 = Double.parseDouble(valor1);
		double sal2 = Double.parseDouble(valor2);
		double sal3 = Double.parseDouble(valor3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("A media dos salarios %.2f, %.2f, %.2f eh %.2f", 
				sal1, sal2, sal3, media);
		
		entrada.close();
	}
}
