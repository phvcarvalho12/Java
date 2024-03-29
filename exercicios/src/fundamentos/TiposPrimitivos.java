package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//informacoes do funcionario
		
		//tipos numericos inteiros
		byte AnosdeEmpresa = 23;
		short voos = 542;
		int id = 56789;
		long pontos = 3_234_453_254L;
		
		//tipos numericos reais
		float salario = 11_453.44F;
		double vendasAcumuladas = 2_423_245.45;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'a'; //ativo
				
		//dias de empresa
		System.out.println(AnosdeEmpresa * 365);
		System.out.println(voos / 2);
		System.out.println(pontos / vendasAcumuladas);
		System.out.println(id + " ganha --> " + salario);
		System.out.println("Esta de ferias? "+ estaDeFerias);
		System.out.println(status);
	}
}
