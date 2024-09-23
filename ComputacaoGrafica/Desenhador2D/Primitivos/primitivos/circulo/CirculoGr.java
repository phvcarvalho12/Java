package primitivos.circulo;
import java.awt.Color;
import java.awt.Graphics;

import primitivos.ponto.PontoGr;

/**
 * Escreva a descri��o da classe CirculoGr aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */
public class CirculoGr extends Circulo {
    // Atributos do circulo grafico
    Color corCirculo = Color.BLACK;   // cor da Circulo
    String nomeCirculo = ""; // nome da Circulo
    Color corNomeCirculo  = Color.BLACK;
    int espCirculo = 1; // espessura da Circulo

    public CirculoGr(double x, double y, double raio) {
        super(x, y, raio);
        // cor, nome e espessura sao defaults
    }

    public CirculoGr(int xc, int yc, int raio, Color cor, String nome, int esp) {
        super((double) xc, (double) yc, (double) raio);
        setCorCirculo(cor);
        setNomeCirculo(nome);
        setEspCirculo(esp);
    }

    /**
     * @return the corCirculo
     */
    public Color getCorCirculo() {
        return corCirculo;
    }

    /**
     * @param corCirculo the corCirculo to set
     */
    public void setCorCirculo(Color corCirculo) {
        this.corCirculo = corCirculo;
    }

    /**
     * @return the nomeCirculo
     */
    public String getNomeCirculo() {
        return nomeCirculo;
    }

    /**
     * @param nomeCirculo the nomeCirculo to set
     */
    public void setNomeCirculo(String nomeCirculo) {
        this.nomeCirculo = nomeCirculo;
    }

    /**
     * @return the corNomeCirculo
     */
    public Color getCorNomeCirculo() {
        return corNomeCirculo;
    }

    /**
     * @param corNomeCirculo the corNomeCirculo to set
     */
    public void setCorNomeCirculo(Color corNomeCirculo) {
        this.corNomeCirculo = corNomeCirculo;
    }

    /**
     * @return the espCirculo
     */
    public int getEspCirculo() {
        return espCirculo;
    }

    /**
     * @param espCirculo the espCirculo to set
     */
    public void setEspCirculo(int espCirculo) {
        this.espCirculo = espCirculo;
    }

    /**
     * Desenha circulo grafico utilizando equacao parametrica (angulo de 0 a 360)
     *
     * @param g Graphics. Classe com os metodos graficos do Java
     */
    public void desenharCirculo(Graphics g){
        // Variaveis auxiliares
        PontoGr ponto = new PontoGr(); 
        double x, y;

        double angIni = 0;
        double angFim = 45;
        double incr = 0.15;
        double alfa = 0;

        // percorre de 0  ate 45. 
        // x e� calculado pela equacao: x = xc + R*seno(alfa)
        // y e� calculado pela equacao: y = yc + R*cos(alfa)
        for(alfa = angIni; alfa <= angFim; alfa = alfa + incr){ 
            // Calculo de x e y (por trigonometria)
            x = getRaio() * Math.sin((alfa*Math.PI)/180.);
            y = getRaio() * Math.cos((alfa*Math.PI)/180.);

            // desenhar 8 pontos (um em cada octante) por simetria
            desenharPontosSimetricos(g, (int)x, (int)y, ponto);
        }
    }

    /**
     * Desenha os pontos simetricos do circulo. Um em cada octante
     * @param g - componente para acessar modo gr�fico
     * @param x - coordenada x de um ponto do primeiro octante do circulo
     * @param y - coordenada y de um ponto do primeiro octante do circulo
     * @param ponto - objeto utilizado para "acender" (desenhar) um ponto
     */
    private void desenharPontosSimetricos(Graphics g, int x, int y, PontoGr ponto){
        // pega o centro do circulo
        int cx = (int)getCentro().getX();
        int cy = (int)getCentro().getY();

        // seta cor e espessura
        ponto.setCorPto(getCorCirculo());
        ponto.setDiametro(getEspCirculo());

        // desenha nome do circulo
        g.setColor(getCorNomeCirculo());
        g.drawString(getNomeCirculo(), cx, cy);

        // desenha os 8 pontos simetricos. Inclui o centro do circulo
        // (1) (cx+x, cy+y)
        desenharPontoSimetrico(cx + x, cy + y, ponto, g);
        // (2) (cx+y, cy+x)
        desenharPontoSimetrico(cx + y, cy + x, ponto, g);
        // (3) (cx-y, cy+x)
        desenharPontoSimetrico(cx - y, cy + x, ponto, g);
        // (4) (cx-x, cy+y)
        desenharPontoSimetrico(cx - x, cy + y, ponto, g);
        // (5) (cx-x, cy-y)
        desenharPontoSimetrico(cx - x, cy - y, ponto, g);
        // (6) (cx-y, cy-x)
        desenharPontoSimetrico(cx - y, cy - x, ponto, g);
        // (7) (cx+y, cy-x)
        desenharPontoSimetrico(cx + y, cy - x, ponto, g);
        // (8) (cx+x, cy-y)
        desenharPontoSimetrico(cx + x, cy - y, ponto, g);
    }

    /**
     * M�todo desenharPontoSimetrico
     *
     * @param x Uma coordenada x passada como coordenada para come�ar o desenho
     * @param y Uma coordenada y passada como coordenada para come�ar o desenho
     * @param ponto Um par�metro para chamar a fun��o desenhar ponto
     * @param g O parametro do grafico
     */
    private void desenharPontoSimetrico(int x, int y, PontoGr ponto, Graphics g){
        ponto.setX(x);
        ponto.setY(y);
        ponto.desenharPonto(g);
    }
}
