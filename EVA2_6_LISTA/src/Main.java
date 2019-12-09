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
        Nodo nObj1 = new Nodo();
        nObj1.valor = 100;
        nObj1.siguiente = new Nodo();
        nObj1.siguiente.valor = 200;
        nObj1.siguiente.siguiente = new Nodo();
        nObj1.siguiente.siguiente.valor = 300;
        System.out.println("nObj1 = " + nObj1.valor);
        System.out.println("nObj2 = " + nObj1.siguiente.valor);
        System.out.println("nObj3 = " + nObj1.siguiente.siguiente.valor);
    }
    
}
//NODOS
class Nodo{
    //DATO A ALMACENAR
    int valor;
    Nodo siguiente;
}