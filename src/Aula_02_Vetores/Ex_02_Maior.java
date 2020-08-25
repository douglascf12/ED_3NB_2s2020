package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;

public class Ex_02_Maior {

	public static void main(String[] args) {
		int n = leInteiroPositivo();
		int v[] = leVetorAleatorio(n);
		exibeVetor(v);
		
		int posMaior = maiorVetor(v);
		
		System.out.printf("\nO maior elemento do vetor está a posição: %d", posMaior);
		System.out.printf("\nO maior elemento do vetor é: %d", v[posMaior]);

	}

	public static int maiorVetor(int[] v) {
		int posMaior = 0;
		
		for (int i = 1; i < v.length; i++) {
			if(v[i] > v[posMaior]) {
				posMaior = i;
			}
		}
		return posMaior;
	}
}
