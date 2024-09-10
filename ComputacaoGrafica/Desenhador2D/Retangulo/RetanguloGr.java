package Retangulo;
import java.awt.Color;
import java.awt.Graphics;
import ponto.Ponto;
import ponto.PontoGr;
import reta.RetaGr;
import reta.Reta;
import reta.FiguraRetas;

/**
 * Escreva uma descrição da classe RetanguloGr aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class RetanguloGr
{
    public Ponto P1 , P2;
    PontoGr ponto;
    FiguraRetas reta = new FiguraRetas(); 
    Color c;
    int esp;
    public RetanguloGr(int x1 , int y1 , int x2 , int y2, Color cor, String nome, int esp){
        P1 = new Ponto(x1 , y1);
        P2 = new Ponto(x2 , y2);
        c = cor; 
        this.esp = esp;
    }
    public void desenharRetangulo(Graphics g){
        //descobre o ponto com < y e desenha as retas
        int x1 , x2 , y1 , y2;
        x1 = (int)P1.getX();
        x2 = (int)P2.getX();
        y1 = (int)P1.getY();
        y2 = (int)P2.getY();
        
        reta.desenharReta(g, x1 , y1 , x2 , y1 , "" , esp , c);
        reta.desenharReta(g, x1 , y1 , x1 , y2 , "" , esp , c);
        reta.desenharReta(g, x1 , y2 , x2 , y2 , "" , esp , c);
        reta.desenharReta(g, x2 , y2 , x2 , y1 , "" , esp , c);
        
        
    }
}
