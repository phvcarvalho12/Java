package Circulo;
import java.awt.Color;
import java.awt.Graphics;
import ponto.Ponto;
import ponto.PontoGr;
/**
 * Escreva uma descrição da classe CirculoGr aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CirculoGr
{
    public Ponto P1 , P2;
    PontoGr ponto;
    public Color c;
    public int esp;
    public CirculoGr(int x1 , int y1 , int x2 , int y2, Color cor, String nome, int esp){
        P1 = new Ponto(x1 , y1);
        P2 = new Ponto(x2 , y2);
        c = cor; 
        this.esp = esp;
    }
    
    public void desenharCirculo(Graphics g){
        Ponto centro;
        
        if(P1.getX() < P2.getX()){
            centro = P1;
            P1 = P2;
        }else{
            centro = P2;
        }
    
        double raio = ((P1.getX() - centro.getX()) * (P1.getX() - centro.getX())) + ((P1.getY() - centro.getY()) * (P1.getY() - centro.getY()));
        
        raio = Math.sqrt(raio);
        
        double x , y , xc , yc , a , b;
        double angulograu = 0;
        double angulo = 0;
        
        xc = centro.getX();
        yc = centro.getY();
        /*while(angulograu <= 360){
            angulo = angulograu * (Math.PI/180);
            x = centro.getX() + raio * Math.cos(angulo);
            y = centro.getY() + raio * Math.sin(angulo);
            
            ponto = new PontoGr((int)x , (int)y , c , 4);
            
            ponto.desenharPonto(g);
            
            angulograu+=0.1;
        }*/
        
        //algoritmo para calcular a partir de 1 octante
        while(angulograu <= 45){
            angulo = angulograu * (Math.PI/180);
            
            a = raio * Math.cos(angulo);
            b = raio * Math.sin(angulo);
            
            x = xc + a;
            y = yc + b;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
        
            x = xc + b;
            y = yc + a;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
            
            x = xc - b;
            y = yc + a;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
            
            x = xc - a;
            y = yc + b;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
            
            x = xc - a;
            y = yc - b;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
            
            x = xc - b;
            y = yc - a;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
            
            x = xc + b;
            y = yc - a;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
            
            x = xc + a;
            y = yc - b;
            
            ponto = new PontoGr((int)x , (int)y , c , esp);
            ponto.desenharPonto(g);
            
            angulograu+=0.01;
        }
    }
    public void desenharCirculo2(Graphics g){
        Ponto centro;
        if(P1.getX() < P2.getX()){
            centro = P1;
            P1 = P2;
        }else{
            centro = P2;
        }
    
        double raio = ((P1.getX() - centro.getX()) * (P1.getX() - centro.getX())) + ((P1.getY() - centro.getY()) * (P1.getY() - centro.getY()));
        raio = Math.sqrt(raio);
        
        double xc = centro.getX();
        double yc = centro.getY();
        
        double ladoD = xc + raio;
        double ladoE = xc - raio;
        double x , y , delta;
        
        for(x = ladoE ; x <= ladoD; x+= 0.1){
            delta = Math.sqrt((raio * raio) - ((x - xc) * (x - xc)));
            if(delta >= 0){
                y = delta + yc; 
                ponto = new PontoGr((int)x , (int)y , c ,esp);
                ponto.desenharPonto(g);
                y = -delta + yc;
                ponto = new PontoGr((int)x , (int)y , c ,esp);
                ponto.desenharPonto(g);
            }
        }       
    }
}
