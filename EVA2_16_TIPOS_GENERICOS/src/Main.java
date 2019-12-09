/**
 *
 * @author Luis Santillanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo<String> nodo = new Nodo<>();
        nodo.setValor("Hola mundo cruel!!");
        
    }
    
}


class Nodo<T>{
    private T valor;
    Nodo siguiente;
    Nodo previo;

    public Nodo() {
        this.siguiente = null;
        this.previo = null;
    }

    public Nodo(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
}