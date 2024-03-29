import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Forneca seu nome: ");
		String nome = entrada.next();
		
		System.out.printf("Bem vindo %s", nome);
		
		entrada.close();
	
	}
}
