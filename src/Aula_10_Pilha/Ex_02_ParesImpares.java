package Aula_10_Pilha;

import java.util.Random;

/**
 * @author douglascf12
 */
public class Ex_02_ParesImpares {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        Pilha pares = new Pilha();
        Pilha impares = new Pilha();
        
        for(int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            if(num % 2 == 0) {
                pares.push(num);
            } else {
                impares.push(num);
            }
        }
        
        System.out.println("Pilha Pares");
        while(!pares.vazia()) {
            System.out.println(pares.pop());
        }
        
        System.out.println("Pilha Ímpares");
        while(!impares.vazia()) {
            System.out.println(impares.pop());
        }
    }
}
