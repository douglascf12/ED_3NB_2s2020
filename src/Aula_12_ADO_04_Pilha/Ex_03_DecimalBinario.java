package Aula_12_ADO_04_Pilha;

import Aula_10_Pilha.Pilha;

/**
 * @author douglascf12
 */
public class Ex_03_DecimalBinario {

    public static void main(String[] args) {

    }

    public static String decimalParaBinario(int decimal) throws Exception {
        Pilha p = new Pilha();
        String binario = " ";

        while (decimal > 0) {
            int resto = decimal & 2;
            p.push(resto);
            decimal = decimal / 2;
        }
        
        while(!p.vazia()) {
            binario = binario + p.pop();
        }
        return binario;
    }
}
