package beecrowd;

import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {

		int senhaCorreta = 2002;
		int senha;
		
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("Digite a senha: ");
			senha = entrada.nextInt();
			
			
			if(senha != senhaCorreta)
				System.out.println("Senha Invalida");
			else {
				System.out.println("Acesso Permitido");
			
			}
		} while (senha != senhaCorreta);
		
		entrada.close();
	}
}

