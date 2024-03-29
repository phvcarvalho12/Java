package classe;

public class ProdutoConstrutor {
	
	String nome;
	double preco;
	double desconto;
	
	ProdutoConstrutor(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
