package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
		public static void main(String[] args) {
			
			double a = 1; //implicita
			System.out.println(a);
			
			float b = (float) 1.2345454635423; //explicita (cast)
			System.out.println(b);
			
			int c = 128;
			byte d = (byte) c; //explicita (cast)
			System.out.println(d);
			
			double e = 1.99999;
			int f = (int) e; //explicita (cast)
			System.out.println(f);
						
		}
}
