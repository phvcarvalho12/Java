package TratamentoExcecao;

import javax.swing.JOptionPane;

public class ExemploComExcecaoV1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String aux = null;

        try {
            int x = 10, 
                y = 0, 
                vet[] = new int[1]; // Criacao de um array de tamanho 1
            
            // Preenchimento do array    
            vet[0] = 10;
            vet[1] = 20; // ????
            
            // Leitura do teclado
            aux = JOptionPane.showInputDialog("Forneça um inteiro: ");
            
            // Conversao para inteiro
            y = Integer.parseInt(aux);
            
            // Calculo com divisao por zero
            System.out.println("x/y = " + x/y);
            
            // Chamada de um método
            calculaAlgo(0);
 
        } catch(NumberFormatException e){
            if (aux == null){
                System.out.println("Foi cancelado!");
            } else if(aux.equals("")) {
                System.out.println("String vazia!!");
            }else{
                System.out.println("Erro de formato do numero!");
            }
        } catch(ArithmeticException e){
            System.out.println("Excecao aritmetica: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("Estouro de array! (" + e.getMessage() + ")");
        } catch(Exception e){
            System.out.println("Sistema Indisponível." + e.getMessage());
        }

    }

    static void calculaAlgo(int x)throws NumeroNegativoException, ArithmeticException {
        if (x == 0){
            throw new ArithmeticException("Valor zerado!");
        }
        else if(x < 0){
            throw new NumeroNegativoException("Erro: numero negativo");
        }

    }

}
