package Cadastro;

import aluno.*;
import eds.*;
import entrada.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import Entidades.*;
import eds.IArmazenador;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import aluno.*;
import entrada.IEntrada;
/**
 * Escreva uma descrição da classe Janela aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Janela extends JFrame implements ActionListener{
    private JTextField nome;
    private JTextField qtd;
    private JTextField idade;
    private JTextField ra;
    private JTextField curso;
    private JTextField semestre;
    private Disciplina disc[] = new Disciplina[3]; 
    private JButton botao ;
    private CadastroAlunos c;
    Janela(String titulo){
        super(titulo);
        
        c = Menu.getAlunos();
        
        setSize(350, 200);
        setLocation(100, 100);
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(9,1));
        
        JLabel entrada = new JLabel("Nome: ", JLabel.CENTER);
        entrada.setFont(new Font("Calibri", Font.BOLD, 12));
        cp.add(entrada);
        
        nome = new JTextField();
        nome.addActionListener(this);
        cp.add(nome);
        
        JLabel entrada2 = new JLabel("idade: ", JLabel.CENTER);
        entrada2.setFont(new Font("Calibri", Font.BOLD, 12));
        cp.add(entrada2);
        
        idade = new JTextField();
        idade.addActionListener(this);
        cp.add(idade);
        
        JLabel entrada4 = new JLabel("ra: " , JLabel.CENTER);
        entrada4.setFont(new Font("Calibri", Font.BOLD, 12));
        cp.add(entrada4);
        
        ra = new JTextField();
        ra.addActionListener(this);
        cp.add(ra);
        
        
        JLabel entrada6 = new JLabel("semestre: " , JLabel.CENTER);
        entrada6.setFont(new Font("Calibri", Font.BOLD, 12));
        cp.add(entrada6);
        
        semestre = new JTextField();
        semestre.addActionListener(this);
        cp.add(semestre);
        
        JLabel entrada5 = new JLabel("quantidade de disciplinas: " , JLabel.CENTER);
        entrada5.setFont(new Font("Calibri", Font.BOLD, 12));
        cp.add(entrada5);
        
        qtd = new JTextField();
        qtd.addActionListener(this);
        cp.add(qtd);
        
        botao = new JButton("Confirmar");
        cp.add(botao);
        botao.addActionListener(this);
        botao.setToolTipText("Confirmar Cadastro");
        botao.setActionCommand("Confirmar");
     }
    public void actionPerformed(ActionEvent ae) {
        int idade1;
        int semestre1;
        try{
            String cmd = ae.getActionCommand();
            System.out.println(cmd);
            if(cmd.equals("Confirmar")){
                String nome1 = nome.getText(); 
                idade1 = Integer.parseInt(idade.getText());
                String ra1 = ra.getText();
                int disc = Integer.parseInt(qtd.getText());
                semestre1 = Integer.parseInt(semestre.getText());
                
                c.inserir(ra1 , nome1 , idade1 , semestre1 ,  disc);
                //insere o aluno = cria o objeto
                dispose();
            }
        }catch(Exception e){
            System.out.println("erro: " +e.getMessage());
        }
    }
}
