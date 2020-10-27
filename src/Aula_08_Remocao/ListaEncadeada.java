package Aula_08_Remocao;

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
    
    public void removeInicio() {
        if(vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        
        // A lista possui um ou mais nos, remover o primeiro
        ini = ini.getProx();
    }
    
    public void removeFinal() {
        if(vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        
        No temp = ini;
        No anterior = null;
        
        while(temp.getProx() != null) {
            anterior = temp;
            temp = temp.getProx();
        }
        if(anterior == null) { // lista com 1 nó só
            ini = null; // a lista fica vazia
            return;
        }
        // lista com dois ou mais nós
        anterior.setProx(null);
    }
    
    public void removeFinalR() {
        removeFinalR(null, ini);
    }
    public void removeFinalR(No anterior, No temp) {
        if(vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        if(anterior == null && temp != null) { // lista com 1 nó só
            ini = null; // a lista fica vazia
            return;
        }
        if(temp.getProx() == null) { // estou no último nó
            anterior.setProx(null);
            return;
        }
        removeFinalR(temp, temp.getProx());
    }
    
    public void removeFinal2() {
        if(vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        No temp = ini;
        
        if(temp.getProx() == null) { // lista com 1 nó só
            ini = null; // a lista fica vazia
        }
        while(temp.getProx().getProx() != null) {
            temp = temp.getProx();
        }
        // lista com dois ou mais nós
        temp.setProx(null);
    }
    
    public void removeFinalR2() {
        removeFinalR2(ini);
    }
    
    public void removeFinalR2(No temp) {
        if(vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        if(temp.getProx() == null) { // lista com 1 nó só
            ini = null; // a lista fica vazia
            return;
        }
        if(temp.getProx().getProx() == null) { // lista com dois ou mais nós
            temp.setProx(null);
            return;
        }
        removeFinalR2(temp.getProx());
    }
    
    public void removeOrdenado(int elemento) {
        if(vazia()) {
            System.out.println("Lista vazia!");
            return;
        }
        No temp = ini;
        No anterior = null;
        
        while(temp != null && temp.getElemento() != elemento) {
            anterior = temp;
            temp = temp.getProx();
        }
        // remoção do inicio com 1 ou mais nós
        if(anterior == null) {
            ini = ini.getProx();
            return;
        }
        // remoção entre 2 nós ou no final
        if(temp != null && temp.getElemento() == elemento) {
            anterior.setProx(temp.getProx());
            return;
        }
        System.out.println(elemento + " não está na lista!");
    }
    
    public int contaNos() {
        int cont = 0;
        No temp = ini;
        while(temp != null) {
            temp = temp.getProx();
            cont++;
        }
        return cont;
    }
    
    public No menorNos() {
        No temp = ini;
        No menor = ini;
        while(temp != null) {
            if(temp.getElemento() < menor.getElemento()) {
                menor = temp;
            }
            temp = temp.getProx();
        }
        return menor;
    }
    
    
}
