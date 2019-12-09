
import java.util.Scanner;

/*
 *                  FIBONACCI
 *              0 1 1 2 3 5 8 13 21 34 . . .  
 *  Poisicones  0 1 2 3 4 5  6 7  8  . . . 
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
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Inserte un número: ");
        System.out.println(fibo(in.nextInt()));
    }
    
    public static int fibo(int n1){
        System.out.println("n1 = " + n1);
        switch (n1) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibo(n1-1) + fibo(n1-2);
        }
        
    }
    
}
