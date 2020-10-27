package Aula_12_ADO_04_Pilha;

import Aula_10_Pilha.Pilha;
import java.util.Scanner;

public class Ex_04_InverterPalavras {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um texto (final com.): ");
        String texto = entrada.nextLine();
        System.out.print("O texto com as palavras invertidas é: ");
        System.out.println(invertePalavra(texto));
    }
    
    public static String invertePalavra(String texto) throws Exception {
        Pilha p = new Pilha();
        String inv = "";
        
        for(int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if(c != ' ' && c != '.') {
                p.push(c);
            } else {
                while(!p.vazia()) {
                    inv += p.pop();
                }
                inv += c;
            }
        }
        return inv;
    }
}
