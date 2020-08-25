package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_05_Insercao.leVetorAleatorioTam;

import java.util.Scanner;

import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;

public class Ex_06_Remocao {
    public static void main(String[] args) {
        int v[] = new int[30];
        int n = leInteiroPositivo();
        leVetorAleatorioTam(v,n);
        exibeVetor(v);
        exibeVetorTam(v,n);
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o elemento que deseja remover: ");
        int x = sc.nextInt();
        
        int pos = buscaLinear(v,x);
        if (pos != -1){
           remocao(v,n,pos);
        }
        exibeVetorTam(v,n-1);
      
    }
    
    public static void remocao(int[] v, int n, int pos){
        for (int i=pos; i < n; i++){
            v[i] = v[i+1];
        }
        
    }
    
    public static int buscaLinear(int[] v, int x){
        for (int i=0; i<v.length; i++){
            if (v[i] == x){
                return i; //achou
            }
        }
        return -1; //não achou
    }
}