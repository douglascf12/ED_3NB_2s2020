package Aula_07_Insercao_Busca;

public class testaListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.insereInicio(7);
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
        System.out.println(lista.buscaLinearIT(13));
        System.out.println(lista.buscaLinearIT(6));
        System.out.println(lista.buscaLinearR(13));
        System.out.println(lista.buscaLinearR(6));
        System.out.println(lista.buscaLinearIT2(13).getElemento());
        System.out.println(lista.buscaLinearIT2(6));
        System.out.println(lista.buscaLinearR2(13).getElemento());
        System.out.println(lista.buscaLinearR2(6));
    }
}
