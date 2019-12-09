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
        System.out.println(mcd(181, 3));
    }
    public static int mcd(int dividendo, int divisor){
        //CUÁNDO DETENEMOS LA RECUSION? CUANDO EL DIVISOR SEA CERO
        System.out.println(dividendo+" / "+divisor);
        if(divisor == 0){
            return dividendo;
        }else{
            int residuo = dividendo % divisor;
            return mcd(divisor, residuo);
        }
    }
}
