package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

public class Ex_05_Insercao {

	public static void main(String[] args) {
		int v[] = new int[30];
		int n = leInteiroPositivo();
		leVetorAleatorioTam(v, n);
		exibeVetor(v);
		exibeVetorTam(v, n);
		insercao(v, n, 77, 5);
		exibeVetorTam(v, n+1);

	}
	
	public static void leVetorAleatorioTam(int[] v, int n) {
		for (int i = 0; i < n; i++) {
			v[i] = (int)(Math.random()*100);
		}
	}
	
	public static void exibeVetorTam(int[] v, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("");
	}
	
	public static void insercao(int[] v, int n,  int x, int pos) {
		for(int i=n; i > pos; i--) {
			v[i] = v[i-1];
		}
		v[pos] = x;
	}

}
