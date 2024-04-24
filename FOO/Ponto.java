//- modulo:c01/Ponto.java
// (Ponto-c01) TIPO
public class Ponto {
    // --> (Ponto-c01) VARIAVEIS DE ESTADO.
    int x, y;
    // --> (Ponto-c01) CONSTRUTOR como PREDICADO INICIAL.
    Ponto(int x0, int y0){
        x = x0;
        y = y0;
    }
    
    // --> (Ponto-c01) PREDICADO DE ESTADO.
    boolean igual(Ponto p2){
        return(x == p2.x && y == p2.y);
    }
    
}