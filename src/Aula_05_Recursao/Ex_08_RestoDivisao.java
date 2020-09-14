package Aula_05_Recursao;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author douglascf12
 */
public class Ex_08_RestoDivisao {
    
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int n2 = leInteiroPositivo();
        
        System.out.println("O resto da divisão é: " + restoDivisao(n1, n2));
    }

    public static int restoDivisao(int n1, int n2) {
        if(n1 < n2) {
            return n1;
        }
        return restoDivisao(n1-n2, n2);
    }
    
}
