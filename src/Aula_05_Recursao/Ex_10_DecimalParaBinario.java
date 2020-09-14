package Aula_05_Recursao;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author douglascf12
 */
public class Ex_10_DecimalParaBinario {
    
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        
        System.out.println(decimalParaBinario(n));
    }
    
    public static int decimalParaBinario(int decimal) {
        if(decimal < 2) {
            return decimal;
        }
        return (10 * decimalParaBinario(decimal/2)) + decimal%2;
    }
    
}
