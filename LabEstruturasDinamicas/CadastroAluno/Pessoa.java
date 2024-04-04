
/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pessoa {
    NomePessoa nome;
    int idade;
    String id;
    
    Pessoa(String nome, int idade, String rg){
        this.nome = new NomePessoa(nome);
        this.idade = idade;
        this.id = rg;
    }
    
}
