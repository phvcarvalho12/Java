package TratamentoExcecao;

import javax.swing.JOptionPane;

public class ExemploComExcecaoV2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String aux = null;

        try{
            int x = 10, 
                y = 0, 
                vet[] = new int[1]; // Criacao de um array de tamanho 1
            
            // Preenchimento do array    
            vet[0] = 10;
            //vet[1] = 20; // ????
            
            // Leitura do teclado
            aux = JOptionPane.showInputDialog("Forne�a um inteiro: ");
            
            // Conversao para inteiro
            y = Integer.parseInt(aux);
            
            // Calculo com divisao por zero
            System.out.println("x/y = " + x/y);
            
            // Chamada de um m�todo
            calculaAlgo(0);
 
        }catch(ArithmeticException e){
            System.out.println("Mensagem da excecao: " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("Estouro de array! (" + e.getMessage() + ")");
        }catch(NumberFormatException e){
            if (aux == null){
                System.out.println("Foi cancelado!");
            }else{
                System.out.println("Erro de formato do numero!");
            }
        }catch (NumeroNegativoException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Outra excecao!");
        }

    }

    /**
     * M�todo calculaAlgo
     *
     * @param x Um par�metro
     */
    static void calculaAlgo(int x)throws NumeroNegativoException, ArithmeticException {
        if (x == 0){
            throw new ArithmeticException("Valor zerado!");
        }
        else if(x < 0){
            throw new NumeroNegativoException("ERRO: numero negativo");
        }

    }

}
