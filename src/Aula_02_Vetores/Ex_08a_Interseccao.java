package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetor;
import static Aula_01_Vetores.Ex_07_Busca.busca;
import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;;


public class Ex_08a_Interseccao {
    
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int[] v1 = leVetor(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
		int[] v2 = leVetor(n2);
        exibeVetor(v2);
        
        int[] vInter = new int[n1];
        int nInter = interseccao(v1, v2, vInter);
        
        System.out.print("\nO vetor de Intersecção é: ");
        exibeVetorTam(vInter, nInter);
    }
	
    public static int interseccao(int[] v1, int[] v2, int [] vInter) {
        int j = 0;
	for(int i = 0; i < v1.length; i++) {
            if(busca(v2, v1[i])) {
		vInter[j] = v1[i];
		j++;
            }
	}
	return j;
    }

}
