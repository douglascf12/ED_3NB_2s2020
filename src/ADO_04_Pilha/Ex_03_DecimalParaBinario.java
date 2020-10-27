package ADO_04_Pilha;

import java.util.Scanner;

/**
 * @author douglascf12
 */
public class Ex_03_DecimalParaBinario {

    public static void main(String[] args) throws Exception {
        int decimal = ehInteiroPositivo();
        Pilha p = new Pilha();

        System.out.print(decimal + " Decimal, em Binário é: ");
        decimalParaBinario(decimal, p);
    }
        
    public static void decimalParaBinario(int n, Pilha p) throws Exception {
        while(n > 0) {
            p.push(n % 2);
            n = n / 2;
        }
        for(int i = 0; p.size() > 0; i++) {
            System.out.print(p.pop());
        }
        System.out.println("");
    }
    
    public static int ehInteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número em Decimal positivo: ");
            n = input.nextInt();
        } while(n < 1);
        return n;
    }
    
}