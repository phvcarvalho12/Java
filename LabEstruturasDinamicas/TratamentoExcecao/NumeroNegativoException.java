package TratamentoExcecao;



public class NumeroNegativoException extends Exception{

    
    NumeroNegativoException(){
        super("Numero Negativo.");
    }
    
    NumeroNegativoException(String msg){
        super(msg);
    }
}
