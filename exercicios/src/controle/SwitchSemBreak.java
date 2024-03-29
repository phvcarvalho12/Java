package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
	
		String faixa = "amarelo";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("O cara eh foda");
		case "marrom":
			System.out.println("O cara pode ser o mais foda");
		case "roxo":
			System.out.println("Viado");
		case "verde":
			System.out.println("Meh");
		case "laranja":
			System.out.println("Ta indo");
		case "vermelho":
			System.out.println("sla");
		case "amarelo":
			System.out.println("ruim");
		default:
			System.out.println("noob");
		}
	}
}
