package Circulo;
import java.awt.Color;
import java.awt.Graphics;


/**
 * Escreva uma descri��o da classe FiguraCirculos aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class FiguraCirculos
{
    public static void desenharCirculo(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor) {
        CirculoGr c = new CirculoGr( x1 ,  y1 ,  x2 ,  y2,  cor,  nome, esp);
        c.desenharCirculo2(g);
    }
}
