 

import java.util.Locale; // importa uma classe de biblioteca (Locale)

class CalcBasica {
	
	/** 
	 * Metodo principal main
	 * Parametros: String args[] - Vetor de strings que recebe dados do SO
	 *
	 */
	public static void main(String args[]){ 
		// Define o Locale para utilizar o ponto em decimais
		Locale.setDefault(Locale.US);
		
		if (args.length != 3){ // Verifica numero de parametros
			System.out.println("Numero de parametros invalido!");
		} else { // numero de parametros valido: 3
			String operando1 = args[0];
			String operador = args[1];
			String operando2 = args[2];
			double result = 0;
			
			if(isNumeric(operando1) && isNumeric(operando2)){ // Verifica se eh numerico
				switch (operador){
					case "-":
						result = Double.parseDouble(operando1) - Double.parseDouble(operando2);
					break;
					case "+":
						result = Double.parseDouble(operando1) + Double.parseDouble(operando2);
					break;
					case "x":
						result = Double.parseDouble(operando1) * Double.parseDouble(operando2);
					break;
					case "/":
						result = Double.parseDouble(operando1) / Double.parseDouble(operando2);
					break;
					default:
						System.out.println("Operador invalido!!");
						System.exit(0);
				}	
				
				System.out.printf("Resultado = %.2f", result);
			} else {
				System.out.println("Operando invalido!!");
				System.exit(0);
			}
		}
	}
	
	/**
	 * Metodo isNumeric - verifica se a string eh numerica
	 * Parametros:
	 * 		String str - string a ser verificada
	 * Retorno:
	 * 		boolean - true: a string eh numerica
	 * 		 		- false: a string nao eh numerica
	 */
	public static boolean isNumeric(String str) {
		if (str == null || str.length() == 0) {
			return false;
		}
			
		boolean foundDecimal = false;
		for (char c : str.toCharArray()) { // percorre a string
			if (!Character.isDigit(c)) { // verifica se eh digito
				if (c == '.' && !foundDecimal) { // verifica se existe um unico ponto
					foundDecimal = true;
				} else {
					return false;
				}
			}
		}			
		return true;
	}
}
