package Aula_09_Ado_03_ListaEncadeada;

import Aula_06_Lista_Ecandeada_ADO_02.*;
import java.util.Scanner;

public class ListaEncadeada {
    No ini;
    
    // Cria uma lista encadeada vazia
    public ListaEncadeada() {
        this.ini = null;
    }
    
    public boolean vazia() {
        return ini == null;
    }
    
    public No getIni() {
        return ini;
    }

    public void setIni(No ini) {
        this.ini = ini;
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
    
    /*
    * Método que inverta os Nós de uma lista ligada, alterando (prox) de cada Nó
    * da lista, sem mover suas informações
    */
    public void inverteNos() {
        No temp = ini;
        No anterior = null;
        No posterior = null;
        
        while(temp.getProx() != null) {
            posterior = anterior;
            anterior = temp;
            temp = temp.getProx();
            anterior.setProx(posterior); // anterior olhar pra trás
        }
        // analisar o ultimo temp
        ini = temp; // invertendo o inicio da lista
        ini.setProx(anterior); // temp olhando para trás
    }
    
    public void geraLista(int n) {
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Elemento: ");
            this.insereInicio(entrada.nextInt());
        }
    }
    
    public void geraListaAleatoria(int n) {
        for(int i = 0; i < n; i++) {
            this.insereInicio((int)(Math.random()*20));
        }
    }
    
    public void geraListaOrdenada(int n) {
        for(int i = 0; i < n; i++) {
            this.insereOrdenado((int)(Math.random()*20));
        }
    }
    
    public ListaEncadeada interseccaoDuasListas(ListaEncadeada lista2) {
        No ini1 = this.getIni();
        No ini2 = lista2.getIni();
        ListaEncadeada lista3 = new ListaEncadeada();
        No ini3 = lista3.getIni();
        
        /* percorrer a lista 1 e verificar se os elementos estão na lista 2,
        * se estiver, insere na lista3
        */
        while(ini1 != null) {
            No aux = ini1;
            ini1 = ini1.getProx();
            // busca se aux1 está na lista 2
            if(lista2.buscaLinearIT(aux.getElemento())) {
                // insere aux1 no ínicio da lista 3
                aux.setProx(ini3);
                ini3 = aux;
            }
        }
        lista3.setIni(ini3);
        return lista3;
    }
    
    public ListaEncadeada uniaoDuasListas(ListaEncadeada lista2) {
        No ini1 = this.getIni();
        No ini2 = lista2.getIni();
        ListaEncadeada lista3 = new ListaEncadeada();
        No ini3 = ini1;
        
        /* percorrer a lista 2 e verificar se cada um de seus elementos estão na lista 2,
        * na lista 1, se estiver, insere na lista3;
        */
        while(ini2 != null) {
            No aux = ini2;
            ini2 = ini2.getProx();
            // busca se o aux está na lista 1
            if(this.buscaLinearIT(aux.getElemento())) {
                aux.setProx(ini3);
                ini3 = aux;
            }
        }
        lista3.setIni(ini3);
        return lista3;
    }
    
    public ListaEncadeada intercalaDuasListas(ListaEncadeada lista2) {
        No ini1 = this.getIni();
        No ini2 = lista2.getIni();
        ListaEncadeada lista3 = new ListaEncadeada();
        
        No temp1 = ini1;
        No temp2 = ini2;
        No temp3 = null;
        
        if(this.vazia()) { // lista 1 vazia
            return lista2; // retorna lista 2
        }
        if(lista2.vazia()) { // lista 2 vazia
            return this; // retorna lista 1
        }
        // procura em qual lista iniciar a lista 3
        if(temp1.getElemento() < temp2.getElemento()) {
            temp3 = temp1;
            temp1 = temp1.getProx();
        } else {
            temp3 = temp2;
            temp2 = temp2.getProx();
        }
        No ini3 = temp3;
        // enquanto houver Nós em uma das listas
        while(temp1 != null && temp2 != null) {
            if(temp1.getElemento() < temp2.getElemento()) {
                temp3.setProx(temp1);
                temp3 = temp1;
                temp1 = temp1.getProx();
            } else {
                temp3.setProx(temp2);
                temp3 = temp2;
                temp2 = temp2.getProx();
            }
        }
        // sobras na lista 1
        if(temp1 != null) {
            temp3.setProx(temp1);
        }
        // sobras na lista 2
        if(temp2 != null) {
            temp3.setProx(temp2);
        }
        lista3.setIni(ini3);
        return lista3;
    }
    
}
