package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(l / 3);
		
		Float f = 123.1F;
		System.out.println(f);
		
		Double d = 123.456;
		System.out.println(d);
		
		Character c = '#';
		System.out.println(c + "...");
		
		System.out.println(i);
				
		
	}
}
