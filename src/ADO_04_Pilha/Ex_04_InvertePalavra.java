package ADO_04_Pilha;

import java.util.Scanner;

/**
 * @author douglascf12
 */
public class Ex_04_InvertePalavra {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        Pilha pilha = new Pilha();
        System.out.print("Palavras da frase invertida:");
        inverteFrase(frase, pilha);
    }

    public static void inverteFrase(String frase, Pilha p) throws Exception {
        frase = frase.replace(".", " ");
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            System.out.print(" ");
            for (int i = 0; i < palavra.length(); i++) {
                char caracter = palavra.charAt(i);
                p.push(caracter);
            }
            for (int i = 0; i < palavra.length(); i++) {
                System.out.print(p.pop());
            }
        }
        System.out.println(".");
    }

}