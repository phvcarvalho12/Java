
/**
 * Escreva uma descrição da classe TestaNome aqui.
 * 
 * @author Pedro Carvalho 
 * @version (um número da versão ou uma data)
 */
public class TestaNome {
    public static void main (String args[]){
        
        NomePessoa nome = new NomePessoa("Pedro Henrique Vianna Carvalho");
        
        System.out.println("Nome: " + nome.getNome());
        System.out.println("Nome invertido: " + nome.getNomeInvertido());
        System.out.println("Nome Blibliografico: " + nome.getNomeBiblio());

        NomePessoa nome2 = new NomePessoa("Pedro Henrique Vianna Carvalho");
        
        System.out.println("Nome: " + nome2.getNome());
        System.out.println("Nome invertido: " + nome2.getNomeInvertido());
        System.out.println("Nome Blibliografico: " + nome2.getNomeBiblio());

    }

}
