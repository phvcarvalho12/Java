package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		DataMetodo momo = new DataMetodo(17, 01, 2005);
//		momo.dia = 17;
//		momo.mes = 01;
//		momo.ano = 2005;
		
		DataMetodo eu = new DataMetodo(22, 10, 2004);
//		eu.dia = 22;
//		eu.mes = 10;
//		eu.ano = 2004;
		
		DataMetodo mae = new DataMetodo(26, 04, 1967);
//		mae.dia = 26;
//		mae.mes = 04;
//		mae.ano = 1967;
		
		DataMetodo vo = new DataMetodo(22, 02, 1950);
//		vo.dia = 22;
//		vo.mes = 02;
//		vo.ano = 1950;
		
		System.out.println(momo.dataFormatada());
		System.out.println(eu.dataFormatada());
		System.out.println(mae.dataFormatada());
		System.out.println(vo.dataFormatada());
		
					
	}
}
