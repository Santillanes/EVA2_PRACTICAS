
import java.util.LinkedList;

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
        
        LinkedList<String> lListaEnla = new LinkedList<String>();
        lListaEnla.add("Hola");
        lListaEnla.add(" ");
        lListaEnla.add("mundo");
        lListaEnla.add("");
        lListaEnla.add("cruel");
        lListaEnla.add("!!!!");
        lListaEnla.addFirst("XXXX");
        System.out.println(lListaEnla);
        for (String string : lListaEnla) {
            System.out.print(string + " - ");
        }
        System.out.println("");
        System.out.println("Cantidad de elementos: "+lListaEnla.size());
        lListaEnla.remove(3);
        System.out.println(lListaEnla);
    }
    
}


class Algo{
    
}