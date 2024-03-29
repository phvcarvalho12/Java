package fundamentos;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		double a = 6 * (3 + 2);
		double a2 = Math.pow(a, 2);
		
		double b = a2 / 6;
		
		double c = ((1 - 5)*(2 - 7))/2;
		double d = Math.pow(c, 2);
		
		double e = b - d;
		double e3 = Math.pow(e, 3);
		
		double f = Math.pow(10, 3);
		
		double resultado = e3 / f;
		
		System.out.println(resultado);
	}
}
