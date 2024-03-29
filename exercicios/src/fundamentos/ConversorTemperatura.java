package fundamentos;

public class ConversorTemperatura {
	public static void main(String[] args) {
		double c;
		double f;
		
		c = 30;
		
		System.out.println("A temperatura em celcius eh: " + c);
		
		f =(c * 9.0/5.0) + 32;
		
		System.out.println("A temperatura em fahrenheit eh: " + f);
	}
}
