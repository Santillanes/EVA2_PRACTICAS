/**
 *
 * @author Luis Santillanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arbol miArbol = new Arbol();
        miArbol.agregarNodo(new Nodo(13));
        miArbol.agregarNodo(new Nodo(10));
        miArbol.agregarNodo(new Nodo(18));
        miArbol.agregarNodo(new Nodo(2));
        miArbol.agregarNodo(new Nodo(11));
        miArbol.agregarNodo(new Nodo(17));
        miArbol.agregarNodo(new Nodo(20));
        //miArbol.agregarNodo(new Nodo(16));
        System.out.println("PostOrder");
        miArbol.imprimepostOrder();
        System.out.println("\nPreOrder");
        miArbol.imprimePreOrder();
        System.out.println("\nInOrder");
        miArbol.imprimeInOrder();
        
    }
    
    
}
