import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Escreva uma descrição da classe Janela aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Janela
{
    private JFrame janela;
    private JPanel areaimg;
    private JLabel imagem;
    private BufferedImage imagemOriginal, imagemAtual;
    private JMenuBar barra;

    private JMenu mArquivo;
    private JMenuItem abrir;
    private JMenuItem salvar;

    private JMenu filtros;//menu para filtros
    private JMenuItem fCinza; // imagem em cinza 
    private JMenuItem fBin; // imagem em preto e branco(binario)
    private JMenuItem fPassB; // filtro passa baixa 
    private JMenuItem fPassA; // filtro passa alta

    private JMenuItem hist;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Janela window = new Janela();
                window.janela.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    public Janela(){
        iniciar();
    }

    private void iniciar(){
        janela = new JFrame();
        janela.setBounds(100, 100, 800, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        areaimg = new JPanel();
        janela.getContentPane().add(areaimg, BorderLayout.CENTER);
        areaimg.setLayout(new BorderLayout());

        imagem = new JLabel("", JLabel.CENTER);
        areaimg.add(imagem, BorderLayout.CENTER);

        barra = new JMenuBar();
        janela.setJMenuBar(barra);

        mArquivo = new JMenu("arquivo");
        barra.add(mArquivo);

        abrir = new JMenuItem("abrir imagem");
        abrir.addActionListener(e -> abrirImagem());
        mArquivo.add(abrir);

        salvar = new JMenuItem("salvar imagem");
        salvar.addActionListener(e -> salvarImagem());
        mArquivo.add(salvar);

        filtros = new JMenu("filtros");
        barra.add(filtros);

        fCinza = new JMenuItem("cinza");
        fCinza.addActionListener(e -> fCinza());
        filtros.add(fCinza);

        fBin = new JMenuItem("preto e branco");
        fBin.addActionListener(e -> fBinario());
        filtros.add(fBin);

        fPassB = new JMenuItem("filtro passa-baixa");
        fPassB.addActionListener(e -> fPassaBaixa());
        filtros.add(fPassB);

        fPassA = new JMenuItem("filtro passa-alta");
        fPassA.addActionListener(e -> fPassaAlta());
        filtros.add(fPassA);
        
        //falta o histograma
    }

    private void abrirImagem(){
        JFileChooser escolha = new JFileChooser();
        int img = escolha.showOpenDialog(janela);
        if (img == JFileChooser.APPROVE_OPTION) {
            try {
                File arquivo = escolha.getSelectedFile();
                imagemOriginal = ImageIO.read(arquivo);
                imagemAtual = imagemOriginal;
                imagem.setIcon(new ImageIcon(imagemAtual));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void salvarImagem(){
        if(imagemAtual != null){
            JFileChooser escolher = new JFileChooser();
            int img = escolher.showSaveDialog(janela);
            if (img == JFileChooser.APPROVE_OPTION) {
                try {
                    File arq = escolher.getSelectedFile();
                    ImageIO.write(imagemAtual, "PNG", arq);
                    JOptionPane.showMessageDialog(janela, "Imagem salva com sucesso!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else{
            JOptionPane.showMessageDialog(janela, "Nenhuma imagem para salvar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private void fCinza(){
        if(imagemAtual != null){
            imagemAtual = Controller.filtroCinza(imagemAtual);
            imagem.setIcon(new ImageIcon(imagemAtual));
        }

        else
            JOptionPane.showMessageDialog(janela, "Nenhuma imagem carregada.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private void fBinario(){
           if(imagemAtual != null){
               imagemAtual = Controller.filtroBinario(imagemAtual);
               imagem.setIcon(new ImageIcon(imagemAtual));
           }
        else
            JOptionPane.showMessageDialog(janela, "Nenhuma imagem carregada.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private void fPassaAlta(){
           if(imagemAtual != null){
               imagemAtual = Controller.filtroPassaAlta(imagemAtual);
               imagem.setIcon(new ImageIcon(imagemAtual));
           }
        else
            JOptionPane.showMessageDialog(janela, "Nenhuma imagem carregada.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private void fPassaBaixa(){
           if(imagemAtual != null){
               Controller.filtroPassaBaixa(imagemAtual);
               imagem.setIcon(new ImageIcon(imagemAtual));
           }
        else
            JOptionPane.showMessageDialog(janela, "Nenhuma imagem carregada.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

}
