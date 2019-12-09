/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_primos;

import java.util.Scanner;

/**
 *
 * @author Luis Santillanes
 */
public class EVA2_5_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = in.nextInt();
        if(esPrimoIneficiente(num))
            System.out.println("Es primo.");
        else
            System.out.println("No es primo");
        
    }
    
    public static boolean esPrimoIneficiente(int n){
        boolean resu = true;
        for (int i = 2; i < n; i++) {
            if((n%i) == 0){
                resu = false;
                break;
            }
        }
        return resu;
    }
    
}
