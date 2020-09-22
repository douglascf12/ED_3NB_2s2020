/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Lista_Ecandeada_ADO_02;

/**
 *
 * @author douglascf12
 */
public class ListaEncadeada {
    No ini;
    
    // Cria uma lista encadeada vazia
    public ListaEncadeada() {
        this.ini = null;
    }
    
    public boolean vazia() {
        return ini == null;
    }
    
    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }
    
    public void insereFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;
        while(temp.getProx() != null) {
            temp = temp.getProx();
        }
        temp.setProx(novo);
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;
        while(temp != null) {
            strLista += temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
    }
    
}
