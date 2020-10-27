/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

/**
 *
 * @author douglascf12
 */
public class Pilha {
    private No topo;
    private int tam;
    
    // cria uma Pilha vazia
    public Pilha() {
        this.topo = null;
        this.tam = 0;
    }
    
    public boolean vazia() {
        return this.topo == null;
    }
    
    // empilhar um elemento (inserção no início)
    public void push(Object x) {
        this.topo = new No(x, this.topo);
        this.tam++;
    }
    
    // desempilhar o elemento do topo (remoção no início)
    public Object pop() throws Exception {
        if(this.vazia()) {
            throw new Exception("Erro: A Pilha está vazia!");
        }
        Object elemento = this.topo.getElemento();
        this.topo = this.topo.getProx();
        this.tam--;
        return elemento;
    }
    
    public int size() {
        return this.tam;
    }

    @Override
    public String toString() {
        return "Pilha{" + "topo=" + topo + ", tam=" + tam + '}';
    }
    
}
