package Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import ponto.Ponto;
import ponto.PontoGr;
import reta.RetaGr;
import reta.Reta;
import reta.FiguraRetas;

/**
 * Escreva uma descrição da classe TrianguloGr aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TrianguloGr
{
    public Ponto P1 , P2 , P3;
    PontoGr ponto;
    FiguraRetas tri = new FiguraRetas();
    Color c;
    int esp;
    public TrianguloGr(int x1 , int y1 , int x2 , int y2, int x3, int y3 , Color cor, String nome, int esp){
        P1 = new Ponto(x1 , y1);
        P2 = new Ponto(x2 , y2);
        P3 = new Ponto(x3 , y3);
        c = cor; 
        this.esp = esp;
    }
    
   public void desenharTriangulo(Graphics g){
        //descobre o ponto com < y e desenha as retas
        int x1 , x2 , y1 , y2 , x3 , y3;
        x1 = (int)P1.getX();
        x2 = (int)P2.getX();
        y1 = (int)P1.getY();
        y2 = (int)P2.getY();
        x3 = (int)P3.getX();
        y3 = (int)P3.getY();
        
        tri.desenharReta(g, x1 , y1 , x2 , y2 , "" , esp , c);
        tri.desenharReta(g, x1 , y1 , x3 , y3 , "" , esp , c);
        tri.desenharReta(g, x3 , y3 , x2 , y2 , "" , esp , c);
    } 
}
