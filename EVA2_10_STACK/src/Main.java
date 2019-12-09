
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
        /* UNA PILA TIENE TRES
                PEEK -->  LEER EL NODO DE LA CIMA DE LA PILA
                PUSH -->  AGREGAR UN NODO A LA CIMA DE LA PILA
                POP  -->  
        */
        
        Pila miPila = new Pila();
        miPila.push(new Nodo(100));
        miPila.push(new Nodo(200));
        miPila.push(new Nodo(300));
        miPila.push(new Nodo(400));
        miPila.push(new Nodo(500));
        miPila.print();
        System.out.println("CIMA DE LA PILA: " + miPila.peek());
        try {
            System.out.println("CIMA DE LA PILA: " + miPila.pop());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        miPila.print();
    }
    
    
    
}
