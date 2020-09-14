package Aula_05_Recursao;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author douglascf12
 */
public class Ex_09_QuocienteDivisao {
    
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int n2 = leInteiroPositivo();
        
        System.out.println("O quociente da divisão é: " + quocienteDivisao(n1, n2));
    }

    public static int quocienteDivisao(int n1, int n2) {
        if(n1 < n2) {
            return 0;
        }
        return 1 + quocienteDivisao(n1-n2, n2);
    }
    
}
