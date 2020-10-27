package Aula_09_Ado_03_ListaEncadeada;

import Aula_08_Remocao.*;

public class testaListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.insereInicio(7);
        System.out.println(lista);
        lista.removeFinalR2();
        System.out.println(lista);
        lista.insereInicio(5);
        lista.insereInicio(3);
        System.out.println(lista);
        lista.insereFinal(10);
        lista.insereFinal(13);
        lista.insereFinalR(18);
        lista.insereFinalR(25);
        System.out.println(lista);
        lista.insereOrdenado(1);
        lista.insereOrdenado(9);
        lista.insereOrdenado(29);
        System.out.println(lista);
        //System.out.println(lista.contaNos());
        //System.out.println(lista);
        //System.out.println(lista.menorNos().getElemento());
        lista.inverteNos();
        System.out.println(lista);
    }
}
