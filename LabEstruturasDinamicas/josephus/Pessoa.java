
/**
 * Escreva uma descri��o da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class Pessoa
{
    int id;
    boolean vivo;

    public Pessoa(int id)
    {   this.id = id;
        vivo = true;
    }
    public boolean getVida(){
        return vivo;
    }
    public void setMorte(){
        vivo = false;
    }
}
    
