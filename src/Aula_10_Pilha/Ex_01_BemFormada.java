package Aula_10_Pilha;

import java.util.Scanner;

/**
 * @author douglascf12
 */
public class Ex_01_BemFormada {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma sequencia de () ou []: ");
        String seq = entrada.nextLine();
        
        Pilha p = new Pilha();
        
        for(int i = 0; i < seq.length(); i++) {
            char caracter = seq.charAt(i);
            if(caracter == '(' || caracter == '[') {
                p.push(caracter);
            } else {
                if(p.vazia()) {
                    System.out.println("Não está bem formada!");
                    return;
                }
                char charTopo = (char) p.pop();
                // analizar as compatibilidades
                if(charTopo == '(' && caracter == ']') {
                    System.out.println("Não está bem formada!");
                    return;
                }
                if(charTopo == '[' && caracter == ')') {
                    System.out.println("Não está bem formada!");
                    return;
                }
            }
        }
        // terminou de percorre a sequencia e analisa a pilha
        if(p.vazia()) {
            System.out.println("Está bem formada a sequencia!");
        } else {
            System.out.println("Não está bem formada!");
        }
    }
}
