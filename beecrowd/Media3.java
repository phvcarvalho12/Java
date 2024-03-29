package beecrowd;

import java.util.Scanner;

public class Media3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite as notas: ");
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();
		double n4 = entrada.nextDouble();
		
		n1 *= 0.2;
		n2 *= 0.3;
		n3 *= 0.4;
		n4 *= 0.1;
		
		double media = n1 + n2 + n3 + n4;
		
		if(media >= 7) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno aprovado.");
			System.out.printf("Media final: %.1f\n", media);
		}else if(media <= 6.9 && media >= 5) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno em exame.");
			double nexame = entrada.nextDouble();
			System.out.print("Nota do exame: " + nexame);
			media = (media + nexame)/2;
			if(media >= 5) {
				System.out.println("\nAluno aprovado.");
				System.out.printf("Media final: %.1f\n", media);
			}else {
				System.out.println("\nAluno reprovado.");
			}
		}else {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno reprovado.");
		}
		entrada.close();
	}
}
