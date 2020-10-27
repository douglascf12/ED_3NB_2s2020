package Aula_12_ADO_04_Pilha;

public class Fila {

    private No first;
    private No last;

    // cria uma Fila vazia
    public Fila() {
        this.first = null;
        this.last = null;
    }

    // verifica se a Fila está vazia
    public boolean isEmpty() {
        return this.first == null && this.last == null;
    }

    // enfileirar um elemento da Fila
    public void enqueue(Object item) {
        No novo = new No(item, null);
        if (isEmpty()) {
            this.first = novo;
            this.last = novo;
            return;
        }
        this.last.setProx(novo);
        this.last = novo;
    }
    
    // desemfileirar um elemento da Fila
    public Object dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception ("Erro: Fila vazia!");
        }
        Object item = this.first.getElemento();
        this.first = this.first.getProx();
        return item;
    }
    
    // tamanho da Fila
    public int size() {
        No temp = this.first;
        int cont = 0;
        while(temp != null) {
            temp = temp.getProx();
            cont++;
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Fila{" + "first=" + first + ", last=" + last + '}';
    }
    
}
