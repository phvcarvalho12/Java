package Cadastro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
//import Entidades.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

/**
 * Escreva uma descrição da classe Menu aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import javax.swing.JOptionPane;
public class Menu extends JFrame implements ActionListener{
    private JTextField opc;
    static CadastroAlunos alunos = new CadastroAlunos();

    Menu(String titulo){
        super(titulo);
        setSize(400, 250);
        setLocation(100, 100);
        
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2,1));
        
        JTextArea textArea = new JTextArea("(I)Inserir\n(L)Listar\n(R)Remover\n(1)Salvar\n(2)Ler\n(S)Sair");
        JScrollPane scrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
        
        
        textArea.setFont(new Font("Calibri", Font.BOLD, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        cp.add(textArea);
        
        opc = new JTextField();
        opc.addActionListener(this);
        cp.add(opc);
        opc.setActionCommand("enter");
     

    }
    public void actionPerformed(ActionEvent ae){
        String op = "";
        
        try{    
            op = ae.getActionCommand();
                if(op.equals("enter")){
                    if(opc.getText().equals("S")||opc.getText().equals("s")){
                        dispose();
                    }else
                        alunos.escolha(opc.getText());
                    /*
                    switch(opc.getText()){
                        case "I": 
                            alunos.inserir();
                            break;
                        case "R": 
                            alunos.retirar();
                            break;
                        case "L": 
                            alunos.listar();
                            break;
                        case 1:
                            alunos.salvarLista();
                            break;
                        case 2:
                            alunos.carregarDados();
                            break;
                        case "S": 
                            dispose();
                        default: 
                            System.out.println("opcao incorreta");
                            break;
                    }
                    */
                }
        }catch(NumberFormatException e){
            if (opc == null){
                System.out.println("Foi cancelado!");
            } else if(opc.equals("")) {
                System.out.println("String vazia!!");
            }else{
                System.out.println("Erro de formato do numero!");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Estouro de array (" + e.getMessage() + ")");
        } catch(Exception e){
            System.out.println("Outro erro" +"(" + e.getMessage() + ")");
        }  
    }
    public static CadastroAlunos getAlunos(){
        return alunos;
    }
}
