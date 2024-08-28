package defaultpack;

import java.util.Scanner;

public class Caverna {
    public static void main(String[] args) {
        
        boolean chave = false;
        boolean bau = false;
        Scanner scan = new Scanner(System.in);

        while (!chave) {
            System.out.println("-Chave pesada");
            System.out.println("-Bau");
            System.out.println("Inventario:");
            String toque = scan.nextLine();
            
            String[] partes = toque.split(" ");
            if (partes.length < 2) {
                System.out.println("Entrada inválida. Por favor, use o formato: 'ação objeto'");
                continue;
            }
            String acao = partes[0];
            String objeto = partes[1];
            
            if (acao.equals("t") && objeto.equals("chave")) {
            	System.out.println("Inventario:");
                System.out.println("-Chave\n\n");
                chave = true;
            } else {
                System.out.println("Bau trancado\n\n");
            }
        }
        
        while(!bau) {
        	System.out.println("-Chave pesada");
            System.out.println("-Bau");
            System.out.println("Inventario:");
            System.out.println("-Chave");
            String toque = scan.nextLine();
            
            String[] partes = toque.split(" ");
            if (partes.length < 2) {
                System.out.println("Entrada inválida. Por favor, use o formato: 'ação objeto'");
                continue;
            }
            
            String acao = partes[0];
            String objeto = partes[1];
            
            if (acao.equals("t") && objeto.equals("bau")) {
            	System.out.println("Bau aberto, parabens");
                System.out.println("ganhou joias");
                bau = true;
            }else{
            	System.out.println("Bau trancado\n\n");
            }
            
        }
        scan.close();
    }
}
