package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		ProdutoConstrutor p1 = new ProdutoConstrutor("PC", 5000.00, 0.10);
		
		ProdutoConstrutor p2 = new ProdutoConstrutor("Chopper", 150, 0.05);
//		p2.nome = "Chopper";
//		p2.preco = 150;
//		p2.desconto = 0.05;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("O preco final do produto"
				+ " %s eh %.2f\n\n", p1.nome, precoFinal1);
		System.out.printf("O preco final do produto"
				+ " %s eh %.2f\n\n", p2.nome, precoFinal2);
		System.out.printf("O total da compra dos"
				+ " dois produtos eh %.2f\n", precoFinal1 + precoFinal2);
	}
}
