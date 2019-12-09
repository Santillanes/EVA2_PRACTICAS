
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextByte();
        
        forFalso(num);
        System.out.println("");
        for (int i = num; i >= 1; i--) {
            System.out.print(i + " - ");
           num--;
        }
        System.out.println("");
        
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        forFalso2(n, 1);
        
    }
    public static void forFalso(int num){
        System.out.print(num + " - ");
        if(num>1)
            forFalso(num-1);
    }
    
    public static void forFalso2(int num, int inc){
        
        System.out.println(inc+ " - ");
        if(inc <= num)
            forFalso2(num+1, inc+1);
        
    }
    
    
    
}
