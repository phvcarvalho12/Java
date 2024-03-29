package classe;

public class DataMetodo {

	int dia;
	int mes;
	int ano;
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	DataMetodo(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	DataMetodo(int dia0, int mes0, int ano0){
		dia = dia0;
		mes = mes0;
		ano = ano0;
	}
	
}
