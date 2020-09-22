package Aula_05_Recursao;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author douglascf12
 */
public class Ex_11_BinarioParaDecimal {
    
    public static void main(String[] args) {
        //int n = leInteiroPositivo();
        
        System.out.println(binarioParaDecimal(10010));
    }
    
    public static int binarioParaDecimal(int binario) {
        if(binario < 10) {
            return binario;
        }
        return (2 * binarioParaDecimal(binario/10)) + binario%10;
    }
    
}
