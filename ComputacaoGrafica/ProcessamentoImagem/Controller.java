import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Escreva uma descrição da classe controller aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Controller
{
    public static BufferedImage filtroCinza(BufferedImage imagem){
        BufferedImage imgFinal = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < imagem.getWidth(); x++) {
            for (int y = 0; y < imagem.getHeight(); y++) {
                Color c = new Color(imagem.getRGB(x, y));
                int gray = (int) (c.getRed() /3 + c.getGreen() /3 + c.getBlue() /3);
                Color grayColor = new Color(gray, gray, gray);
                imgFinal.setRGB(x, y, grayColor.getRGB());
            }
        }
        return imgFinal;
    }

    public static BufferedImage filtroBinario(BufferedImage imagem){
        BufferedImage imgFinal = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < imagem.getWidth(); x++) {
            for (int y = 0; y < imagem.getHeight(); y++) {
                Color c = new Color(imagem.getRGB(x, y));
                int gray = (int) (c.getRed() /3 + c.getGreen() /3 + c.getBlue() /3);
                Color grayColor = new Color(gray, gray, gray);
                imgFinal.setRGB(x, y, grayColor.getRGB());
                Color corfinal;
                if(gray > 128)
                    corfinal = Color.BLACK; 
                else 
                    corfinal = Color.WHITE;
                imgFinal.setRGB(x, y, corfinal.getRGB());
            }
        }
        return imgFinal;

    }

    public static BufferedImage filtroPassaBaixa(BufferedImage imagem){

        BufferedImage imgFinal = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < imagem.getWidth(); x++) {
            for (int y = 0; y < imagem.getHeight(); y++) {
                int r = 0, g = 0, b = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        Color c = new Color(imagem.getRGB(x + i, y + j));
                        r += c.getRed();
                        g += c.getGreen();
                        b += c.getBlue();
                    }
                }
                r /= 9;
                g /= 9;
                b /= 9;
                imgFinal.setRGB(x, y, new Color(r, g, b).getRGB());
            }
        }
        return imgFinal;

    }
    
    public static BufferedImage filtroPassaAlta(BufferedImage imagem){
        BufferedImage img1 = filtroPassaBaixa(imagem);
        BufferedImage imgFinal = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);

        
        for (int x = 0; x < imagem.getWidth(); x++) {
            for (int y = 0; y < imagem.getHeight(); y++) {
                Color c1 = new Color(imagem.getRGB(x, y));
                Color c2 = new Color(img1.getRGB(x, y));
                int r = Math.abs(c1.getRed() - c2.getRed());
                int g = Math.abs(c1.getGreen() - c2.getGreen());
                int b = Math.abs(c1.getBlue() - c2.getBlue());
                imgFinal.setRGB(x, y, new Color(r, g, b).getRGB());
            }
        }
        
        return imgFinal;
    }
    
    public static void criarHistograma(BufferedImage imagem){
        int[] histograma = new int[256];
        for (int x = 0; x < imagem.getWidth(); x++) {
            for (int y = 0; y < imagem.getHeight(); y++) {
                Color color = new Color(imagem.getRGB(x, y));
                int gray = (int) (color.getRed() * 0.3 + color.getGreen() * 0.59 + color.getBlue() * 0.11);
                histograma[gray]++;
            }
        }
        JFrame frame = new JFrame("Histograma");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 400);
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < histograma.length; i++) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * 3, getHeight() - histograma[i] / 10, 2, histograma[i] / 10);
                }
            }
        });
        frame.setVisible(true);
        
    }

}
