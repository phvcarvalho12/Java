 

public class HelloWorld {
	
	public static void main(String[] args) {
		
		int x = 20;
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.printf("args[%d] = %s\n", i, args[i]);
			}
		}
		/*
		System.out.println("Ola mundo!");
		System.out.println("O valor da variavel eh " + x);
		System.out.printf("O valor da variavel eh %d\n", x);
		*/
	}
}
