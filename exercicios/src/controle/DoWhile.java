package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Voce precisa falar "
					+"\nas palavras magicas");
			System.out.print("Voce quer sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");
		entrada.close();
	}
}
