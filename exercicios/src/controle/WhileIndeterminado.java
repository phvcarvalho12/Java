package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		String palavra = "";
		Scanner entrada = new Scanner(System.in);
		
		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Digite a palavra: ");
			palavra = entrada.nextLine();
		}
		
		entrada.close();
		
	}
}
