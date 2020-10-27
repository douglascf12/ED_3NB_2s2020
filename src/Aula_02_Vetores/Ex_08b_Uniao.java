package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetor;
import static Aula_01_Vetores.Ex_07_Busca.busca;
import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;

public class Ex_08b_Uniao {

    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int[] v1 = leVetor(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int[] v2 = leVetor(n2);
        exibeVetor(v2);
        
        int[] vUniao = new int[n1+n2];
        int nUniao = uniao(v1, v2, vUniao);
        
        System.out.print("\nO vetor de União é: ");
        exibeVetorTam(vUniao, nUniao);
    }
	
    public static int uniao(int[] v1, int[] v2, int[] vUniao) {
	int j = 0;
	for (int i = 0; i < v1.length; i++) {
            vUniao[j] = v1[i];
            j++;
	}
	for(int i = 0; i < v2.length; i++) {
            if(!busca(v1, v2[i])) {
		vUniao[j] = v2[i];
		j++;
            }
	}
	return j;
}

}
