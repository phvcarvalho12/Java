package fundamentos;

public class notacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "amigo");
		s = s.toUpperCase();
		s = s.concat("!!!");
			
		System.out.println(s);
		
		String x = "pedro".concat("taina").toUpperCase();
		System.out.println(x);
	}
}
