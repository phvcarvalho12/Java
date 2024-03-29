package controle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.print("Qual sua nota? ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10:
			conceito = "A, parabens";
			break;
		case 9:
			conceito = "A-, parabens";
			break;
		case 8:
			conceito = "B";
			break;
		case 7:
			conceito = "B-";
			break;
		case 6:
			conceito = "C";
			break;
		case 5:
			conceito = "C-";
			break;
		case 4:
			conceito = "D";
			break;
		case 3:
			conceito = "D-";
			break;
		case 2:
			conceito = "E";
			break;
		case 1:
			conceito = "E-";
			break;
		case 0:
			conceito = "F";
			break;
		default:
			conceito = "não encontrado.";
			break;
		}
		entrada.close();
		System.out.println("O conceito eh " + conceito);
	}
}
