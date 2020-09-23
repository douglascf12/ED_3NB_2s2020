package Aula_07_Insercao_Busca;

import Aula_06_Lista_Ecandeada_ADO_02.*;

public class ListaEncadeada {
    No ini;
    
    // Cria uma lista encadeada vazia
    public ListaEncadeada() {
        this.ini = null;
    }
    
    public boolean vazia() {
        return ini == null;
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
    
    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }
    
    public void insereFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;
        
        if(temp == null) { // lista vazia
            ini = novo;
        } else { // tem 1 ou mais nós
            while(temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
    }
    
    public void insereFinalR(int elemento) {
        insereFinalR(ini, elemento);
    }
    
    public void insereFinalR(No temp, int elemento) {
        if(temp == null) { // lista vazia
            No novo = new No(elemento, null);
            ini = novo;
        }
        if(temp.getProx() == null) { // estar no último nó
            No novo = new No(elemento, null);
            temp.setProx(novo);
        } else {
            insereFinalR(temp.getProx(), elemento);
        }
    }

    public void insereOrdenado(int elemento) {
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;
        
        while(temp != null && temp.getElemento() < elemento) {
            anterior = temp;
            temp = temp.getProx();
        }
        
        // lista vazia ou inserir no inicio
        if(anterior == null) {
            ini = novo;
        } else {
            // lista tem 1 ou mais nós
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }
    
    public boolean buscaLinearIT(int x) {
        No temp = ini;
        
        while(temp != null) {
            if(temp.getElemento() == x) {
                return true; // achou
            }
            temp = temp.getProx();
        }
        return false; // não achou
    }
    
    public boolean buscaLinearR(int x) {
        return buscaLinearR(ini, x);
    }
    
    public boolean buscaLinearR(No temp, int x) {
        if(temp == null) {
            return false; // não achou
        }
        if(temp.getElemento() == x) {
            return true; // achou
        }
        return buscaLinearR(temp.getProx(), x);
    }
    
    public No buscaLinearIT2(int x) {
        No temp = ini;
        
        while(temp != null) {
            if(temp.getElemento() == x) {
                return temp; // achou
            }
            temp = temp.getProx();
        }
        return null; // não achou
    }
    
    public No buscaLinearR2(int x) {
        return buscaLinearR2(ini, x);
    }
    
    public No buscaLinearR2(No temp, int x) {
        if(temp == null || temp.getElemento() == x) {
            return temp;
        }
        return buscaLinearR2(temp.getProx(), x);
    }
    
    
    
}
