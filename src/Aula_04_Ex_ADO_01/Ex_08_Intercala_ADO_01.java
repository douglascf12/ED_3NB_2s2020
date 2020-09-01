/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Ex_ADO_01;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_04_Ex_ADO_01.Ex_06_Interseccao.bubbleSort;
import static Aula_04_Ex_ADO_01.Ex_06_Interseccao.exibeInterseccao;

/*
* 8) Escreva uma função que receba dois vetores (A[] e B[]), com n e m elementos, respectivamente. 
* Os vetores estão ordenados em ordem crescente, a função aloca um vetor C[], exatamente com soma dos 
* tamanhos de A e B, e intercala os elementos de A[] e B[] em C[], de forma que o vetor C[] fique em ordem 
* crescente. A função deve ter complexidade O(n+m), ou seja, a soma dos tamanho dos vetores.
 */

/**
 *
 * @author douglascf12
 */
public class Ex_08_Intercala_ADO_01 {
    public static void main(String[] args) {
        
        int n = leInteiroPositivo();
        int[] vetorA = leVetorAleatorio(n);
        bubbleSort(vetorA);
        exibeVetor(vetorA);
       
        int m = leInteiroPositivo();
        int[] vetorB = leVetorAleatorio(m);
        bubbleSort(vetorB);
        exibeVetor(vetorB);
        
        int[] vetorC = intercalaVetores(vetorA, vetorB);
        System.out.print("\nOs elementos da Intercalação são: ");
        exibeVetor(vetorC);

    }
    
    public static int[] intercalaVetores(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[vetorA.length + vetorB.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < vetorC.length) {
            // sobras em B
            if(i == vetorA.length) {
                vetorC[k] = vetorB[j];
                j++;
                k++;
            } else if(j == vetorB.length) {
                vetorC[k] = vetorA[i];
                i++;
                k++;
            } else {
                if(vetorA[i] <= vetorB[j]) {
                    vetorC[k] = vetorA[i];
                    i++;
                    k++;
                } else if(vetorB[j] < vetorA[i]) {
                    vetorC[k] = vetorB[j];
                    j++;
                    k++;
                }
            }      
        }
        return vetorC;
    }
    
}
