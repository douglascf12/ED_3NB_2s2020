package Aula_09_Ado_03_ListaEncadeada;

public class testaADO03 {
    public static void main(String[] args) {
        ListaEncadeada lista1 = new ListaEncadeada();
        lista1.geraListaAleatoria(7);
        System.out.println("Lista 1: " + lista1);
        ListaEncadeada lista2 = new ListaEncadeada();
        lista2.geraListaAleatoria(5);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Intersecção: " + lista1.interseccaoDuasListas(lista2));
        
        System.out.println("");
        
        ListaEncadeada lista3 = new ListaEncadeada();
        lista3.geraListaAleatoria(7);
        System.out.println("Lista 3: " + lista3);
        ListaEncadeada lista4 = new ListaEncadeada();
        lista4.geraListaAleatoria(5);
        System.out.println("Lista 4: " + lista4);
        System.out.println("União: " + lista3.uniaoDuasListas(lista4));
        
        System.out.println("");
        
        ListaEncadeada lista5 = new ListaEncadeada();
        lista5.geraListaOrdenada(7);
        System.out.println("Lista 5: " + lista5);
        ListaEncadeada lista6 = new ListaEncadeada();
        lista6.geraListaOrdenada(5);
        System.out.println("Lista 6: " + lista6);
        System.out.println("Intercalação: " + lista5.intercalaDuasListas(lista6));
    }
}
