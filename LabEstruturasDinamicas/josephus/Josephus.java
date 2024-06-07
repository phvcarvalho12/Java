import Lista.*;
/**
 * Escreva uma descrição da classe Josephus aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Josephus{
    
    public static void main(String args[]){
        Josephus j = new Josephus();
        j.calcularMortes(9 , 50);
    }
    public Josephus(){
        
    }
    public void calcularMortes(int k , int n){
        ListaDuplamenteLigadaCircular L = new ListaDuplamenteLigadaCircular();
        Pessoa p1;
        for(int i = 1; i <= n ; i++){
            p1 = new Pessoa(i);
            L.inserirFim(p1);
        }
        No c = L.getInicio();
        int x = 1;
        
        while(L.getQtdNos() > 1){
            c = c.getProximo();
            if(x % k == 0){
                c = c.getAnterior();
                System.out.println("removeu a pessoa na posicao " + x);
            }
            c = c.getProximo();
            x++;
            if(x > n){
                x = (x + k) % n;
            }
        }
    }
}
