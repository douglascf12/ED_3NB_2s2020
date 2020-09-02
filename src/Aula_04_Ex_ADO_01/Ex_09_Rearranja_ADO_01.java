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
* 9) Escreva uma função que recebe um vetor como parâmetro, a sua função seleciona o primeiro elemento de um 
* vetor e rearranja o vetor de forma que todos elementos menores ou iguais ao primeiro elemento fiquem a sua 
* esquerda e os maiores a sua direita.
* 
* No vetor {5, 6, 2, 7, 9, 1, 8, 3, 7} 
* após ser rearranjado teríamos 
* {1, 3, 2, 5, 9, 7, 8, 6, 7}.
*
* A função deve rearranjar o vetor com a complexidade O(n).
*/

/**
 *
 * @author douglascf12
 */
public class Ex_09_Rearranja_ADO_01 {
    
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] vetor = leVetorAleatorio(n);
        exibeVetor(vetor);
        
        rearranjaVetor(vetor);
        System.out.println("\nOs elementos após o rearranjo: ");
        exibeVetor(vetor);
    }
    
    public static void rearranjaVetor(int[] vetor){
        int pivo = vetor[0];
        int i = 1;
        int j = vetor.length -1;
        while(i <= j) {
            if(vetor[i] <= pivo) {
                i++;
            } else if(vetor[j] > pivo) {
                j--;
            } else {
                int t = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = t;
                i++;
                j--;
            }
        }
        vetor[0] = vetor[j];
        vetor[j] = pivo;
    }
    
}
