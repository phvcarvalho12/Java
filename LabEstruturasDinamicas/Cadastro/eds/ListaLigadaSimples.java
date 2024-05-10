package eds;
import java.io.Serializable;

public class ListaLigadaSimples implements IArmazenador, Serializable{
    No inicio, fim;
    int qtdNos;

    /**
     * ListaLigadaSimples Construtor
     *
     */
    public ListaLigadaSimples(){
        setInicio(null);
        setFim(null);
        setQtdNos(0);
    }

    /**
     * setInicio
     *
     * @param inicio No inicio da lista ligada
     */
    private void setInicio(No inicio){
        this.inicio = inicio;
    }

    /**
     * getInicio
     *
     * @return No de inicio da lista ligada
     */
    public No getInicio(){
        return(this.inicio);
    }

    /**
     * getFim
     *
     * @return No do final da lista ligada
     */
    public No getFim(){
        return(this.fim);
    }

    /**
     * setFim
     *
     * @param fim No fim da lista ligada
     */
    private void setFim(No fim){
        this.fim = fim;
    }

    /**
     * getQtdNos
     *
     * @return int, qtde de nos na lista ligada
     */
    public int getQtd(){
        return this.qtdNos;
    }

    /**
     * setQtdNos
     *
     * @param qtdNos Um parâmetro
     */
    private void setQtdNos(int qtdNos){
        this.qtdNos = qtdNos;
    }

    /**
     * estaVazia
     *
     * @return boolean, true se estiver vazia e false caso contrario
     */
    public boolean estaVazia(){
        boolean vazia = false; 
        if (getQtd() == 0 && getInicio() == null && getFim() == null){
            vazia = true;
        }
        return vazia;
    }

    /**
     * inserirInicio
     *
     * @param elem Objeto a ser inserido no inicio da lista ligada
     */
    public void inserirInicio(Object elem) {
        No novo = new No(elem); //1

        if (estaVazia()){
            setInicio(novo);
            setFim(novo);
        }
        else{
            novo.setProximo(inicio);
            setInicio(novo);
        }
        setQtdNos(getQtd() + 1);
    }

    /**
     * inserirFim
     *
     * @param elem Objeto a ser inserido no fim da lista ligada
     */
    public void adicionar(Object elem){
        No novo = new No(elem);
        if (estaVazia()){
            setInicio(novo);
            setFim(novo);
        }
        else{
            getFim().setProximo(novo);
            setFim(novo);
        }
        setQtdNos(getQtd() + 1);
    }

    /**
     * removerInicio
     *
     * @return Objeto removido
     */
    public Object removerInicio(){
        No aux = null;
        Object obj = null; 
        if(!estaVazia()){
            if ((getInicio() == getFim())){
                aux = getInicio();
                setInicio(null);
                setFim(null);
            } else {
                aux = getInicio();
                setInicio(aux.getProximo());
                aux.setProximo(null);
            }
            setQtdNos(getQtd() - 1);
            obj = aux.getConteudo();
        }

        return(obj);
    }

    /**
     * removerFim
     *
     * @return Objeto removido
     */
    public Object removerFim(){
        No ant = getInicio();
        No aux = null;
        Object obj = null; 
        if (!estaVazia()){
            if ((getInicio() == getFim())){
                aux = getInicio();
                setInicio(null);
                setFim(null);
            } else {            
                // percorre ate achar o no antes do fim
                while(ant.getProximo() != fim){
                    ant = ant.getProximo();
                }
                ant.setProximo(null);
                aux = fim;
                setFim(ant);
            }
            setQtdNos(getQtd() - 1);
            obj = aux.getConteudo();           
        }
        return obj;
    }

    /**
     * Método remover
     *
     * @param i Um parâmetro
     * @return O valor de retorno
     */
    public Object remover(int i){ //remove o objeto na posicao fornecida

        No ant = getInicio();
        No ap = getInicio();
        //No aux = null;
        Object obj = null;
        int k = 0;

        if(!estaVazia()){

            if(i >= 0 && i < getQtd()){
                if(i == 0)
                    obj = removerInicio();
                else if(i == getQtd() - 1)
                    obj = removerFim();
                else{
                    while(k != i){
                        ant = ap;
                        ap = ap.getProximo();
                        k++;
                    }

                    ant.setProximo(ap.getProximo());
                    setQtdNos(getQtd() - 1);
                    obj = ap.getConteudo();

                }
            }
        }

        return obj;
    }

    /**
     * Método buscar
     *
     * @param i Um parâmetro
     * @return O valor de retorno
     */
    public Object buscar(int i){ //devolve o objeto na posicao fornecida

        No ap = getInicio();
        int k = 0;
        Object obj = null;
        if(!estaVazia()){

            if(i >= 0 && i < getQtd()){
                while(k != i)
                {ap = ap.getProximo(); k++;}  

                obj = ap.getConteudo();
            }

        }

        return obj;
    }
}