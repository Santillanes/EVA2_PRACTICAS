
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Santillanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista miLista = new Lista();
        miLista.add(new Nodo(4));
        miLista.add(new Nodo(5));
        miLista.add(new Nodo(6));
        miLista.add(new Nodo(7));
        miLista.add(new Nodo(8));
        miLista.add(new Nodo(9));
        miLista.add(new Nodo(10));
        miLista.addBegin(new Nodo(99999));
        boolean vacia = miLista.isEmpty();
        System.out.println("");
        
        if(vacia)
            System.out.println("LISTA VACIA");
        else
            System.out.println("LISTA CON NODOS");
        
        
        
        System.out.println("Añadir un nodo en una posición específica.");
        try {
            miLista.insertAt(0, new Nodo(150));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.print();
        
        
        
        try {
            miLista.delete(7);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Lista con nodo borrado: ");
        miLista.print();
        
        System.out.println("Número de Nodos: "+miLista.size());
        
        System.out.println("El valor #3 es: " + miLista.getAt(3));
    }
    
}
