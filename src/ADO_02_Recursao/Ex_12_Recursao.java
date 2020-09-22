package ADO_02_Recursao;

import java.util.Scanner;

/*
* 12. Dada uma sequência de números inteiros positivos, descreva uma função recursiva para encontrar:
* a) Busca linear de um elemento da sequência;
* b) Menor elemento da sequência;
* c) A soma dos elementos da sequência
* d) A média aritmética dos elementos da sequência
* Considere que as sequência informada para as funções não é vazia, ou seja, se n >= 1.
*/

/**
 * Class Description...
 *
 * @author Douglas Cardoso Ferreira
 * @version: 1.0 Main
 * Main Class File: Ex_12_Recursao.java
 * File: Ex_12_Recursao.java
 * Date: 14/09/2020
 */

public class Ex_12_Recursao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = leTamanhoVetor(); // pede para o usuario preencher o tamanho do vetor A
        int[] vetor = preencheVetorAleatorio(tamanho); // preenche o vetor A com números aleatorios
        exibeVetor(vetor);
        
        System.out.print("Busca Linear -> Digite um dos números do vetor: ");
        int nBuscaLinear = sc.nextInt();
        System.out.println("O número digitado se encontra na posição: " + buscaLinear(vetor, nBuscaLinear, 0));
        
        System.out.println("O Menor Elemento da Sequência é: " + menorElemento(vetor, vetor.length-1, vetor[0], 1));
        
        System.out.println("A Soma dos Elementos da Sequência é: " + somaElementosSequencia(vetor, 0));
        
        System.out.println("A Média Aritmética dos Elementos da Sequência: " + mediaAritmetica(vetor, vetor.length-1, 0));
    }
    
    public static int buscaLinear(int[] vetor, int n, int i) {
        if(vetor[i] == n) {
            return i;
        }
        return buscaLinear(vetor, n, i+1);
    }
    
    public static int menorElemento(int[] vetor, int tamanho, int menor, int i) {
        if(i < tamanho) {
            if(vetor[i] < menor) {
                menor = vetor[i];
            }
            return menorElemento(vetor, tamanho, menor, i+1);
        }
        return menor;
    }
    
    public static int somaElementosSequencia(int[] vetor, int n) {
        if(n < vetor.length) {
            return vetor[n] + somaElementosSequencia(vetor, n+1);
        }
        return 0;
    }
    
    public static double mediaAritmetica(int[] vetor, int tamanho, int soma) {
        soma = soma + vetor[tamanho];
        if(tamanho > 0) {
            return mediaAritmetica(vetor, tamanho-1, soma);
        }
        return (double)soma/vetor.length;
    }
    
    public static int leTamanhoVetor() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = sc.nextInt();
        } while(n < 1);
        return n;
    }

    public static int[] preencheVetorAleatorio(int n) {
        int v[] = new int[n];
        for(int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
        }
        return v;
    }
    
    public static void exibeVetor(int[] v) {
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

}
