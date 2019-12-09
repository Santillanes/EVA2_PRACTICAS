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
        System.out.println(calculaFactorial(5));
        
    }
    public static int calculaFactorial(int num){
        System.out.println("Inicio "+num);
        if(num == 0) //SI NUM == 0 DEBEMOS DETENER LA RECURSIVIDAD
            return 1;
        else
            return (num * calculaFactorial(num-1));
    }
}
