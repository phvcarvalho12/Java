package CadastroAluno;

import javax.swing.JOptionPane;
/**
 * Escreva uma descri��o da classe Menu aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class Menu {
    static final String [] opcoes = {"(I)nserir", "(R)emover","(L)istar", "(S)air"};

    
    String menuOpcoes(){
        String str = "";
        
        for (String s: opcoes){
            str = str + "\n" + s;
        }
        
        String aux = JOptionPane.showInputDialog(str);
        
        return (aux);
    }
}
