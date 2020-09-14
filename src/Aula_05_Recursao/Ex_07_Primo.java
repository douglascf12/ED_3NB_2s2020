package Aula_05_Recursao;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author douglascf12
 */
public class Ex_07_Primo {
    
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        
        if(ePrimo(n)) {
            System.out.println(n + " é primo!");
        } else {
            System.out.println(n + " não é primo!");
        }
    }

    public static boolean ePrimo(int n) {
        return ePrimo(n, n-1);
    }
    
    public static boolean ePrimo(int n, int i) {
        if(i == 1) {
            return true;
        }
        if(n % i == 0) {
            return false;
        }
        return ePrimo(n, i-1);
    }
    
}
