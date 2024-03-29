package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o dia da semana? ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Hoje eh domingo, dia 1");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("Hoje eh segunda, dia 2");
		}else if(dia.equalsIgnoreCase("terca")) {
			System.out.println("Hoje eh terca, dia 3");
		}else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("Hoje eh quarta, dia 4");
		}else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("Hoje eh quinta, dia 5");
		}else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("Hoje eh sexta, dia 6");
		}else if(dia.equalsIgnoreCase("sabado")) {
			System.out.println("Hoje eh sabado, dia 7");
		}
	
		entrada.close();
	}
}
