package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.println("ola mundo!");
		System.out.printf("endereco: %d\n", 24645);
		System.out.println("adoleta");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Qual o seu sobrenome? ");
		String sobrenome = entrada.nextLine();
		System.out.println("Qual a sua idade? ");
		int idade = entrada.nextInt();
		System.out.printf("Seu nome eh %s %s e vc tem %d anos.\n\n",
			nome, sobrenome, idade);
		
		entrada.close();
	}
}
