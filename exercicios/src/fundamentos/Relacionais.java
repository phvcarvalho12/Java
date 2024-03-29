package fundamentos;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(30 != 7);
		System.out.println(3 > 7);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		
		double nota = 7.5;
		boolean bomMenino = true;
		boolean passouFaculdade = nota >= 7;
		
		boolean desconto = passouFaculdade && bomMenino;
		System.out.println("Tem desconto na proxima matricula? " + desconto);
	}
}
