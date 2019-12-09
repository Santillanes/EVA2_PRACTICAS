
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Santillanes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  AGREGAR     al final
            QUITAR      del inicio
            LEER        del inicio
        */
        Queue miQueue = new Queue();
        miQueue.agregar(new Nodo(100));
        miQueue.agregar(new Nodo(200));
        miQueue.agregar(new Nodo(300));
        miQueue.agregar(new Nodo(400));
        miQueue.agregar(new Nodo(500));
        miQueue.print();
        System.out.println("CIMA DE LA PILA: " + miQueue.leer());
        try {
            miQueue.quitar();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        miQueue.print();
    }
    
}
