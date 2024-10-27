import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ponto.FiguraPontos;
import reta.FiguraRetas;
import Circulo.FiguraCirculos;
import Retangulo.FiguraRetangulos;
import Triangulo.FiguraTriangulos;
import ponto.PontoGr;
import reta.RetaGr;
import Circulo.CirculoGr;
import Retangulo.RetanguloGr;
import Triangulo.TrianguloGr;

/**
 * Cria desenhos de acordo com o tipo e eventos do mouse
 * 
 * @author Julio Arakaki 
 * @version 20220815
 */
public class PainelDesenho extends JPanel implements MouseListener, MouseMotionListener {

    JLabel msg;           // Label para mensagens
    TipoPrimitivo tipo; // Tipo do primitivo
    Color corAtual;       // Cor atual do primitivo
    int esp;              // Diametro do ponto

    // Para ponto
    int x, y;

    ArrayList<Object> figuras = new ArrayList<Object>();

    // Para reta
    int x1, y1, x2, y2 , x3 , y3;
    int xant = 0; 
    int yant = 0;

    // selecionar primeiro click do mouse
    boolean primeiraVez = true;
    boolean segundaVez = false;

    /**
     * Constroi o painel de desenho
     *
     * @param msg mensagem a ser escrita no rodape do painel
     * @param tipo tipo atual do primitivo
     * @param corAtual cor atual do primitivo
     * @param esp espessura atual do primitivo
     */
    public PainelDesenho(JLabel msg, TipoPrimitivo tipo, Color corAtual, int esp){
        setTipo(tipo);
        setMsg(msg);
        setCorAtual(corAtual);
        setEsp(esp);

        // Adiciona "ouvidor" de eventos de mouse
        this.addMouseListener(this); 
        this.addMouseMotionListener(this);

    }

    /**
     * Altera o tipo atual do primitivo
     *
     * @param tipo tipo do primitivo
     */
    public void setTipo(TipoPrimitivo tipo){
        this.tipo = tipo;
    }

    /**
     * Retorna o tipo do primitivo
     *
     * @return tipo do primitivo
     */
    public TipoPrimitivo getTipo(){
        return this.tipo;
    }

    /**
     * Altera a espessura do primitivo
     *
     * @param esp espessura do primitivo
     */
    public void setEsp(int esp){
        this.esp = esp;
    }

    /**
     * Retorna a espessura do primitivo
     *
     * @return espessura do primitivo
     */
    public int getEsp(){
        return this.esp;
    }

    /**
     * Altera a cor atual do primitivo
     *
     * @param corAtual cor atual do primitivo
     */
    public void setCorAtual(Color corAtual){
        this.corAtual = corAtual;
    }

    /**
     * retorna a cor atual do primitivo
     *
     * @return cor atual do primitivo
     */
    public Color getCorAtual(){
        return this.corAtual;
    }

    /**
     * Altera a msg a ser apresentada no rodape
     *
     * @param msg mensagem a ser apresentada
     */
    public void setMsg(JLabel msg){
        this.msg = msg;
    }

    /**
     * Retorna a mensagem
     *
     * @return mensagem as ser apresentada no rodape
     */
    public JLabel getMsg(){
        return this.msg;
    }

    /**
     * Metodo chamado quando o paint eh acionado
     *
     * @param g biblioteca para desenhar em modo grafico
     */
    public void paintComponent(Graphics g) { 
        apagarPrimitivos(g);

        desenharPrimitivos(g);
    }

    /**
     * Evento: pressionar do mouse
     *
     * @param e dados do evento
     */
    public void mousePressed(MouseEvent e) { 
        Graphics g = getGraphics();  
        if (tipo == TipoPrimitivo.PONTO){
            x = e.getX();
            y = e.getY();
            PontoGr p = new PontoGr(x, y, getCorAtual(), getEsp());
            figuras.add(p);
            paint(g);
        } else if (tipo == TipoPrimitivo.RETA){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                RetaGr r = new RetaGr(x1, y1 , x2 , y2 , getCorAtual() , getEsp());
                figuras.add(r);
                paint(g);
            }
        }else if(tipo == TipoPrimitivo.CIRCULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                CirculoGr c = new CirculoGr(x1, y1, x2, y2, getCorAtual(), "", getEsp());
                figuras.add(c);
                paint(g);
            }
        }else if(tipo == TipoPrimitivo.RETANGULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
            } else {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                primeiraVez = true;
                RetanguloGr ret = new RetanguloGr(x1, y1, x2, y2, getCorAtual(), "", getEsp());
                figuras.add(ret);
                paint(g);
            }
        }else if(tipo == TipoPrimitivo.TRIANGULO){
            if (primeiraVez == true) {
                x1 = (int)e.getX();
                y1 = (int)e.getY();
                primeiraVez = false;
                segundaVez = true;
            } else if(segundaVez == true) {
                x2 = (int)e.getX();
                y2 = (int)e.getY();
                segundaVez = false;
            } else {
                x3 = (int)e.getX();
                y3 = (int)e.getY();
                primeiraVez = true;
                TrianguloGr t = new TrianguloGr(x1, y1, x2, y2 , x3 , y3 , getCorAtual(), "", getEsp());
                figuras.add(t);
                paint(g);
            }
        }else if(tipo == TipoPrimitivo.SELECIONAR){
            x = (int)e.getX();
            y = (int)e.getY();
            int posicao = selecionarFigura(x ,y);
            System.out.println("posicao da figura no array:"+posicao);
        }

    }     

    public void mouseReleased(MouseEvent e) {
        Graphics g = getGraphics(); 
        if (tipo == TipoPrimitivo.RETA){
            x2 = (int) e.getX();
            y2 = (int) e.getY();
            primeiraVez = true;
            RetaGr r = new RetaGr(x1, y1 , x2 , y2 , getCorAtual() , getEsp());
            figuras.add(r);
            paint(g); //desenha a reta
        }
        if(tipo == TipoPrimitivo.CIRCULO){
            x2 = (int) e.getX();
            y2 = (int) e.getY();
            primeiraVez = true;
            CirculoGr c = new CirculoGr(x1, y1, x2, y2, getCorAtual(), "", getEsp());
            figuras.add(c);
            paint(g); //desenha o circulo
        }
        if(tipo == TipoPrimitivo.RETANGULO){
            x2 = (int) e.getX();
            y2 = (int) e.getY(); 
            primeiraVez = true;
            RetanguloGr ret = new RetanguloGr(x1, y1, x2, y2, getCorAtual(), "", getEsp());
            figuras.add(ret);
            paint(g); //desenha o retangulo
        }
    }           

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        if(tipo != TipoPrimitivo.TRIANGULO){

            Graphics g = getGraphics();  
            xant = x2;
            yant = y2;
            x2 = (int)e.getX();
            y2 = (int)e.getY();

            paint(g);
            this.msg.setText("(" + e.getX() + ", " + e.getY() + ") - " + getTipo());
        }
    }

    /**
     * Evento mouseMoved: escreve mensagem no rodape (x, y) do mouse
     *
     * @param e dados do evento do mouse
     */
    public void mouseMoved(MouseEvent e) {
        this.msg.setText("("+e.getX() + ", " + e.getY() + ") - " + getTipo());
        //this.msg.setText("("+e.getX() + ", " + e.getY() + ")");
    }

    /**
     * Desenha os primitivos
     *
     * @param g biblioteca para desenhar em modo grafico
     */
    public void desenharPrimitivos(Graphics g){
        if (tipo == TipoPrimitivo.PONTO){
            FiguraPontos.desenharPonto(g, x, y, "", getEsp(), getCorAtual());
            //PontoGr p = new PontoGr(x, y, getCorAtual(), getEsp());
            //figuras.add(p);
        }

        if (tipo == TipoPrimitivo.RETA){
            FiguraRetas.desenharReta(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());
            //RetaGr r = new RetaGr(x1, y1, x2, y2, getCorAtual(), getEsp());
            //figuras.add(r);
        }

        if (tipo==TipoPrimitivo.CIRCULO){
            FiguraCirculos.desenharCirculo(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());
            //CirculoGr c = new CirculoGr(x1, y1, x2, y2, getCorAtual(), "", getEsp());
            //figuras.add(c);
        }
        if(tipo == TipoPrimitivo.RETANGULO){
            FiguraRetangulos.desenharRetangulo(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());
            //RetanguloGr ret = new RetanguloGr(x1, y1, x2, y2, getCorAtual(), "", getEsp());
            //figuras.add(ret);
        }
        if(tipo == TipoPrimitivo.TRIANGULO){
            FiguraTriangulos.desenharTriangulo(g, x1, y1, x2, y2 , x3 , y3 , "", getEsp(), getCorAtual());
            //TrianguloGr t = new TrianguloGr(x1, y1, x2, y2 , x3 , y3 , getCorAtual(), "", getEsp());
            //figuras.add(t);
        }
    }

    public void apagarPrimitivos(Graphics g){
        Object n;
        int tamanho = figuras.size() -1;
        if(figuras.size() == -1){
            tamanho = 0;
        }
        //if(tamanho != 0){
        if (tipo == TipoPrimitivo.RETA){
            FiguraRetas.desenharReta(g, x1, y1, xant, yant, "", getEsp(), getBackground());
            //figuras.remove(tamanho);
        }

        if (tipo==TipoPrimitivo.CIRCULO){
            FiguraCirculos.desenharCirculo(g, x1, y1, xant, yant, "", getEsp(), getBackground());
            //figuras.remove(tamanho);
        }

        if (tipo == TipoPrimitivo.RETANGULO){
            FiguraRetangulos.desenharRetangulo(g, x1, y1, xant, yant, "", getEsp(), getBackground());
            //figuras.remove(tamanho);
        }   
        for(int i = 0; i < figuras.size(); i++){

            n = figuras.get(i);
            if(n instanceof PontoGr){
                PontoGr ponto = (PontoGr)n;
                FiguraPontos.desenharPonto(g, ponto.x, ponto.y, "", ponto.diametro, getCorAtual());
            }else if(n instanceof RetaGr){
                RetaGr reta = (RetaGr)n;
                FiguraRetas.desenharReta(g, (int)reta.getP1().getX(), (int)reta.getP1().getY(), (int)reta.getP2().getX(), (int)reta.getP2().getY(), "", reta.getEspReta(), reta.getCorReta());
            }else if(n instanceof CirculoGr){
                CirculoGr circulo = (CirculoGr)n;
                FiguraCirculos.desenharCirculo(g, (int)circulo.P1.getX(), (int)circulo.P1.getY(), (int)circulo.P2.getX(), (int)circulo.P2.getY(), "", circulo.esp, circulo.c);
            }else if(n instanceof RetanguloGr){
                RetanguloGr retangulo = (RetanguloGr)n;
                FiguraRetangulos.desenharRetangulo(g, (int)retangulo.P1.getX(), (int)retangulo.P1.getY(), (int)retangulo.P2.getX(), (int)retangulo.P2.getY(), "", retangulo.esp, retangulo.c);
            }else if(n instanceof TrianguloGr){
                TrianguloGr triangulo = (TrianguloGr)n;
                FiguraTriangulos.desenharTriangulo(g, (int)triangulo.P1.getX(), (int)triangulo.P1.getY(), (int)triangulo.P2.getX(), (int)triangulo.P2.getY(), (int)triangulo.P3.getX(), (int)triangulo.P3.getY(), "", triangulo.esp, triangulo.c);
            }

        }
        //}
    }

    /**
     * Método apagarFiguras
     * remove todos os polinomios da area de desenho
     */
    public void apagarFiguras(){
        Graphics g = getGraphics();
        int tamanho = figuras.size();
        while(figuras.size() > 0){
            figuras.remove(0); 
        }
        g.setColor(getBackground());
        g.drawRect(0, 0, 700, 600);
        g.fillRect(0, 0, 700, 600);
    }

    public void redesenharPrimitivos(){
        Object n;
        Graphics g = getGraphics();
        for(int i = 0; i < figuras.size(); i++){
            n = figuras.get(i);
            if(n instanceof PontoGr){
                PontoGr ponto = (PontoGr)n;
                FiguraPontos.desenharPonto(g, ponto.x, ponto.y, "", ponto.diametro, getCorAtual());
            }else if(n instanceof RetaGr){
                RetaGr reta = (RetaGr)n;
                FiguraRetas.desenharReta(g, (int)reta.getP1().getX(), (int)reta.getP1().getY(), (int)reta.getP2().getX(), (int)reta.getP2().getY(), "", reta.getEspReta(), reta.getCorReta());
            }else if(n instanceof CirculoGr){
                CirculoGr circulo = (CirculoGr)n;
                FiguraCirculos.desenharCirculo(g, (int)circulo.P1.getX(), (int)circulo.P1.getY(), (int)circulo.P2.getX(), (int)circulo.P2.getY(), "", circulo.esp, circulo.c);
            }else if(n instanceof RetanguloGr){
                RetanguloGr retangulo = (RetanguloGr)n;
                FiguraRetangulos.desenharRetangulo(g, (int)retangulo.P1.getX(), (int)retangulo.P1.getY(), (int)retangulo.P2.getX(), (int)retangulo.P2.getY(), "", retangulo.esp, retangulo.c);
            }else if(n instanceof TrianguloGr){
                TrianguloGr triangulo = (TrianguloGr)n;
                FiguraTriangulos.desenharTriangulo(g, (int)triangulo.P1.getX(), (int)triangulo.P1.getY(), (int)triangulo.P2.getX(), (int)triangulo.P2.getY(), (int)triangulo.P3.getX(), (int)triangulo.P3.getY(), "", triangulo.esp, triangulo.c);
            }

        }
    }

    public int selecionarFigura(int x , int y){
        Object c;
        Graphics g = getGraphics();
        PontoGr p;
        boolean achou = false;
        int i = x-3;
        int j = y-3;
        int pos = -1;
        int k = 0;
        if(figuras.size() != 0){
            while(i < x + 3 && achou == false){
                while(j < y + 3 && achou == false){
                    while(k < figuras.size() && achou == false){
                        c = figuras.get(k);
                        if(c instanceof PontoGr){
                            PontoGr ponto = (PontoGr)c;
                            if(ponto.x == i && ponto.y == j){
                                pos = k;
                                achou = true;
                                p = new PontoGr(i , j , Color.RED ,30);
                                p.desenharPonto(g);
                                System.out.println("x = "+ i+"y = "+ j);
                            }
                        }else if(c instanceof RetaGr){
                            RetaGr reta = (RetaGr)c;
                            if((reta.getP1().getX() == i && reta.getP1().getY() == j)||(reta.getP2().getX() == i && reta.getP2().getY() == j)){
                                pos = k;
                                achou = true;
                                p = new PontoGr(i , j , Color.RED ,30);
                                p.desenharPonto(g);
                                System.out.println("x = "+ i+"y = "+ j);
                            }

                        }else if(c instanceof CirculoGr){
                            CirculoGr circulo = (CirculoGr)c;
                            if((circulo.P1.getX() == i && circulo.P1.getY() == j)||(circulo.P2.getX() == i && circulo.P2.getY() == j)){
                                pos = k; 
                                achou = true;
                                p = new PontoGr(i , j , Color.RED ,30);
                                p.desenharPonto(g);
                                System.out.println("x = "+ i+"y = "+ j);
                            }
                        }else if(c instanceof RetanguloGr){
                            RetanguloGr retangulo = (RetanguloGr)c;
                            if((retangulo.P1.getX() == i && retangulo.P1.getY() == j)||(retangulo.P2.getX() == i && retangulo.P2.getY() == j)){
                                pos = k; 
                                achou = true;
                                p = new PontoGr(i , j , Color.RED ,30);
                                p.desenharPonto(g);
                                System.out.println("x = "+ i+"y = "+ j);
                            }
                        }else if(c instanceof TrianguloGr){
                            TrianguloGr triangulo = (TrianguloGr)c;
                            if((triangulo.P1.getX() == i && triangulo.P1.getY() == j)||(triangulo.P2.getX() == i && triangulo.P2.getY() == j)||(triangulo.P3.getX() == i && triangulo.P3.getY() == j)){
                                pos = k; 
                                achou = true;
                                p = new PontoGr(i , j , Color.RED ,30);
                                p.desenharPonto(g);
                                System.out.println("x = "+ i+"y = "+ j);
                            }
                        }
                        k++;
                    }
                    j++;
                    k = 0;
                }
                i++;
                j = 0;
            }
        }
        return pos;
    }
}
