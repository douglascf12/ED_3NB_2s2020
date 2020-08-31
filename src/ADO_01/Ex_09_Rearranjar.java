package ADO_01;
import java.util.Scanner;

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
 * Class Description...
 * 
 * @author Douglas Cardoso Ferreira
 * @version: 1.0
 * Main Class File: Ex_09_Rearranjar.java
 * File: Ex_09_Rearranjar.java
 * Date: 31/08/2020
 */
public class Ex_09_Rearranjar {
    
    public static void main(String[] args) {
        
        int tam = leTamanhoVetor(); // pede para o usuario preencher o tamanho do vetor
        int[] vetor = preencheVetorAleatorio(tam); // preenche o vetor com números aleatorios
        exibeVetor(vetor); // exibe o vetor
        rearranjar(vetor); // reajando o vetor 
        exibeVetor(vetor); // exibe o vetor já rearranjado
        
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
    
    public static int[] preencheVetorAleatorio(int tam) {
        int vetor[] = new int[tam];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random()*100);
        }
	return vetor;
    }
    
    public static void exibeVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
    
    // função que rearranja o vetor, pegando o primeiro elemento e colocando os 
    // elementos de menor valor a sua esquerda e os de maior valor a sua direita.
    public static void rearranjar(int[] vetor) {
        int pElemento = vetor[0];
        for(int i = 1; i < vetor.length; i++) {
            int j = i;
            int aux = vetor[j];
            while(j > 0 && aux < pElemento) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = aux;
        }
    }
    
}
