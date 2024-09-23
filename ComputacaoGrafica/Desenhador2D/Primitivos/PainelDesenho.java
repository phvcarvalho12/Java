import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import primitivos.ponto.FiguraPontos;
import primitivos.reta.FiguraRetas;
import primitivos.circulo.FiguraCirculos;

/**
 * Escreva a descricao da classe PainelDesenho aqui.
 * 
*/
public class PainelDesenho extends JPanel implements MouseListener, MouseMotionListener {

    JLabel msg;           // Label para mensagens
    TipoPrimitivo tipo; // Tipo do primitivo
    boolean isPrimitivo;
    Color corAtual;       // Cor atual do primitivo
    int esp;              // Diametro do ponto
    int raio;

    // Para ponto
    int x, y;

    // Para reta
    int x1, y1, x2, y2;

    // selecionar primeiro click do mouse
    boolean primeiraVez = true;

    int isf;

    /**
     * COnstrutor para objetos da classe PainelDesenho
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

    public void setTipo(TipoPrimitivo tipo){
        this.tipo = tipo;
    }

    public TipoPrimitivo getTipo(){
        return this.tipo;
    }
    
    public void setIsPrimitivo(boolean isPrimitivo){
        this.isPrimitivo = isPrimitivo;
    }
    
    public boolean getIsPrimitivo(){
        return this.isPrimitivo;
    }

    public void setEsp(int esp){
        this.esp = esp;
    }

    public int getEsp(){
        return this.esp;
    }

    public void setCorAtual(Color corAtual){
        this.corAtual = corAtual;
    }

    public Color getCorAtual(){
        return this.corAtual;
    }

    public void setMsg(JLabel msg){
        this.msg = msg;
    }

    public JLabel getMsg(){
        return this.msg;
    }

    public void setIsf(int i){
        this.isf = i;
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void paintComponent(Graphics g) {   
        desenharPrimitivos(g);
    }

    // Capturando os Eventos com o mouse
    public void mousePressed(MouseEvent e) { 
        Graphics g = getGraphics();  
        if (isPrimitivo){
            if (tipo == TipoPrimitivo.PONTO){
                //if (! primeiraVez) {
                x = e.getX();
                y = e.getY();
                //}
                //repaint();
                paint(g);
            } else if (tipo == TipoPrimitivo.RETA){

                if (primeiraVez == true) {
                    x1 = e.getX();
                    y1 = e.getY();
                    primeiraVez = false;
                } else {
                    x2 = e.getX();
                    y2 = e.getY();
                    primeiraVez = true;
                    paint(g);
                } 
            }else if (tipo == TipoPrimitivo.CIRCULO){
                if (primeiraVez == true) {
                    x1 = e.getX();
                    y1 = e.getY();
                    primeiraVez = false;
                } else {
                    x2 = (int)e.getX();
                    y2 = (int)e.getY();
                    primeiraVez = true;

                    // calcula o raio
                    raio = (int)Math.sqrt(Math.pow((y2-y1), 2) + Math.pow((x2-x1), 2));
                    setRaio(raio);
                    paint(g);
                } 
                //paint(g);
            }
        }
    }

    public void mouseReleased(MouseEvent e) { 

    }           

    public void mouseClicked(MouseEvent e) {
        //        this.msg.setText("CLICOU: "+e.getButton());
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        if (this.isPrimitivo) this.msg.setText("("+e.getX() + ", " + e.getY() + ") - " + getTipo());
        else this.msg.setText("(" + e.getX() + ", " + e.getY() + ")");
        //System.out.println("("+e.getX() + ", " + e.getY() + ")");

    }

    public void desenharPrimitivos(Graphics g){
        if (isPrimitivo){

            if (tipo == TipoPrimitivo.PONTO){
                FiguraPontos.desenharPonto(g, x, y, "", getEsp(), getCorAtual());
                //FiguraPontos.desenharPontos(g, 50, 20);
            }

            if (tipo == TipoPrimitivo.RETA){
                FiguraRetas.desenharReta(g, x1, y1, x2, y2, "", getEsp(), getCorAtual());
                //FiguraRetas.desenharRetas(g, 10, 3);
            }

            if (tipo==TipoPrimitivo.CIRCULO){
                FiguraCirculos.desenharCirculo(g, x1, y1, getRaio(), "", getEsp(), getCorAtual());
                //FiguraCirculos.desenharCirculos(g, 50, 2);

            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }

}
