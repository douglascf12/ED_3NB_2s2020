package ADO_03_Lista_Encadeada;

import static ADO_03_Lista_Encadeada.ListaEncadeada.intercalaListasOrdenadas;
import static ADO_03_Lista_Encadeada.ListaEncadeada.interseccaoListas;
import static ADO_03_Lista_Encadeada.ListaEncadeada.uniaoListas;

/*
 * @author Douglas Cardoso Ferreira
 */
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista1 = new ListaEncadeada();
        ListaEncadeada lista2 = new ListaEncadeada();
        
        lista1.insereOrdenado(1);
        lista1.insereOrdenado(2);
        lista1.insereOrdenado(8);
        lista1.insereOrdenado(7);
        lista1.insereOrdenado(9);
        lista1.insereOrdenado(10);
        System.out.println("Lista 1: " + lista1);
        
        lista2.insereOrdenado(2);
        lista2.insereOrdenado(4);
        lista2.insereOrdenado(5);
        lista2.insereOrdenado(8);
        lista2.insereOrdenado(10);
        System.out.println("Lista 2: " + lista2);
        
        ListaEncadeada lista3 = new ListaEncadeada();
        
        lista3 = intercalaListasOrdenadas(lista1, lista2);
        System.out.println("Intercalação das listas: " + lista3);
        
        lista3 = uniaoListas(lista1, lista2);
        System.out.println("União das listas: " + lista3);
        
        lista3 = interseccaoListas(lista1, lista2);
        System.out.println("Intersecção das listas: " + lista3);
    }
}
