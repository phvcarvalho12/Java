package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double notas = 0;
		int quantidadeNotas = 0;
		double total = 0;
		int contador = 0;
		
		while(notas != -1) {
			System.out.println("Digite sua nota(ou -1 para sair): ");
			notas = entrada.nextDouble();
			if(notas > 10 || notas < -1) {
				System.out.println("Digite um nota valida\n");
				contador++;
			}
			if(notas <= 10 && notas >= 0) {
				total += notas;
				quantidadeNotas++;
			}
		}

		double media = total / quantidadeNotas;
		
		System.out.println("A media da turma eh " + media);
		System.out.println("O total de notas invalidas foi " + contador);
		
		entrada.close();
	}
}
