package Aula_10_Pilha;

/**
 * @author douglascf12
 */
public class PilhaVetor {
    private Object item[];
    private int topo;
    
    // criar uma Pilha vazia
    public PilhaVetor(int maxTam) {
        this.item = new Object[maxTam];
        this.topo = 0;
    }
    
    public boolean vazia() {
        return this.topo == 0;
    }
    
    public void push(Object x) throws Exception {
        if(this.topo == this.item.length) {
            throw new Exception("Erro: A Pilha está cheia!");
        }
        this.item[topo] = x;
        this.topo++;
    }
    
    public Object pop() throws Exception {
        if(this.vazia()) {
            throw new Exception("Erro: A Pilha está vazia!");
        }
        this.topo--;
        return this.item[topo];
    }
    
    public int size() {
        return this.topo;
    }

    @Override
    public String toString() {
        return "PilhaVetor{" + "item=" + item + ", topo=" + topo + '}';
    }
    
    
}
