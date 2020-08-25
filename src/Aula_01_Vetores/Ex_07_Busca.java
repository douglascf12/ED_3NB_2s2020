package Aula_01_Vetores;

import java.util.Scanner;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;

public class Ex_07_Busca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = leInteiroPositivo();
		int[] v = leVetorAleatorio(n);
		exibeVetor(v);
		System.out.print("\n\nDigite o número que deseja buscar: ");
		int x = sc.nextInt();
		if(busca(v, x)) {
			System.out.printf("\n%d está no vetor", x);
		} else {
			System.out.printf("\n%d não está no vetor", x);
		}
	}
	
	public static boolean busca(int[] v, int x) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) {
				return true; //achou
			}
		}
		return false; //não achou
	}
}
