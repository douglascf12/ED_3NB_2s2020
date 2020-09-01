/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Ex_ADO_01;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_03_Desempenho_Algoritmos.Ex_02_TrocaMaiorMenor.troca;

/*
6) Escreva uma função que receba dois vetores (A[] e B[]) já ordenados em ordem 
crescente e ambos possuem o mesmo tamanho. A sua função imprime a intersecção entre 
os dois vetores, ou seja, os elementos em comum entre os vetores A[] e B[].
Considere que os vetores não contêm valores duplicados. A função deve ter deve
ter complexidade O(n), ou seja, o tamanho do vetor A[] e do vetor B[].
*/

/**
 *
 * @author douglascf12
 */
public class Ex_06_Interseccao {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] vetorA = leVetorAleatorio(n);
        bubbleSort(vetorA);
        exibeVetor(vetorA);
       
        int[] vetorB = leVetorAleatorio(n);
        bubbleSort(vetorB);
        exibeVetor(vetorB);
        
        System.out.print("\nOs elementos da Intersecção são: ");
        exibeInterseccao(vetorA, vetorB);
    }
	
    //método exibeInterseccao tem desempenho O(n), Linear
    public static void exibeInterseccao(int[] vetorA, int[] vetorB) {
        int i = 0;
        int j = 0;
        while(i < vetorA.length && j < vetorB.length) {
            if(vetorA[i] == vetorB[j]) {
                System.out.print(vetorA[i] + " ");
                i++;
                j++;
            } else {
                if(vetorA[i] < vetorB[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
    }
        
    // método BubbleSort tem desempenho o(nˆ2), quadrático
    public static void bubbleSort(int[] v) {
        for(int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length-1-i; j++) {
                if(v[j] > v[j+1]) {
                    troca(v, j, j+1);
                }
            }
        }
    }
        
}
