package Ado_01;
import java.util.Scanner;

/*
* 8) Escreva uma função que receba dois vetores (A[] e B[]), com n e m elementos, respectivamente. 
* Os vetores estão ordenados em ordem crescente, a função aloca um vetor C[], exatamente com soma dos 
* tamanhos de A e B, e intercala os elementos de A[] e B[] em C[], de forma que o vetor C[] fique em ordem 
* crescente. A função deve ter complexidade O(n+m), ou seja, a soma dos tamanho dos vetores.
*/

/**
 * Class Description...
 * 
 * @author Douglas Cardoso Ferreira
 * @version: 1.0
 * Main Class File: Ex_08_Intercala.java
 * File: Ex_08_Intercala.java
 * Date: DD/MM/YYYY
 */
public class Ex_08_Intercala {
    
    public static void main(String[] args) {
        int tam = leTamanhoVetor(); // pede para o usuario preencher o tamanho do vetor A
        int[] vetorA = preencheVetorAleatorio(tam); // preenche o vetor A com números aleatorios
        tam = leTamanhoVetor(); // pede para o usuario preencher o tamanho do vetor B
        int[] vetorB = preencheVetorAleatorio(tam); // preenche o vetor B com números aleatorios
        ordenaCrescente(vetorA); // ordenar o vetor em ordem crescente
        ordenaCrescente(vetorB); // ordenar o vetor em ordem crescente
        exibeVetor(vetorA); // exibe o vetor
        exibeVetor(vetorB); // exibe o vetor
        int[] vetorC = intercala(vetorA, vetorB); // intercala os vetores A e B em ordem crescente
        exibeVetor(vetorC); // exibe o vetor
    }
    
    public static int leTamanhoVetor() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número positivo até 99: ");
            n = sc.nextInt();
        } while (n <= 0 || n > 100);
        return n;
    }
    
    public static int[] preencheVetorAleatorio(int n) {
        int v[] = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*100);
        }
	return v;
    }
    
    public static void ordenaCrescente(int[] vetor) {
        for(int i = 1; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length - i; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
    
    public static void exibeVetor(int[] v) {
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
    // função que intercala o vetor A e o vetor B no vetor C em ordem crescente.
    public static int[] intercala(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[vetorA.length + vetorB.length];
        int j = 0;
        int k = 0;
        for(int i = 0; i < vetorC.length; i++) {
            if(j < vetorA.length && k < vetorB.length) {
                if(vetorA[j] < vetorB[k]) {
                    vetorC[i] = vetorA[j];
                    j++;
                } else {
                    vetorC[i] = vetorB[k];
                    k++;
                }
            } else {
                vetorC[i] = vetorA[j];
                j++;
            }
        }
        return vetorC;
    }
    
}
