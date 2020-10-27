package ADO_03_Lista_Encadeada;

/*
 * @author Douglas Cardoso Ferreira
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
    
    // método que compara elementos e insere de forma ordenada no nó
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
    
    // método que insere elemento no ultimo nó
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
    
    // método que recebe duas listas ordenadas e as comparadas retornando uma lista intercalada ordenada
    public static ListaEncadeada intercalaListasOrdenadas(ListaEncadeada lista1, ListaEncadeada lista2) {
        No temp = lista1.ini;
        No temp2 = lista2.ini;
        ListaEncadeada lista = new ListaEncadeada();
        while(temp != null) {
            if(temp2 != null) {
                if(temp.getElemento() < temp2.getElemento()) {
                    lista.insereOrdenado(temp.getElemento());
                    temp = temp.getProx();
                } else {
                    lista.insereOrdenado(temp2.getElemento());
                    temp2 = temp2.getProx();
                }
            } else {
                lista.insereOrdenado(temp.getElemento());
                temp = temp.getProx();
            }
        }
        while(temp2 != null) {
            lista.insereOrdenado(temp2.getElemento());
            temp2 = temp2.getProx();
        }
        return lista;
    }
    
    // método que recebe duas listas e retorna uma lista com a união das duas
    public static ListaEncadeada uniaoListas(ListaEncadeada lista1, ListaEncadeada lista2) {
        No temp = lista1.ini;
        No temp2 = lista2.ini;
        ListaEncadeada lista = new ListaEncadeada();
        
        while(temp != null) {
            if(temp2 != null) {
                if(temp.getElemento() == temp2.getElemento()) {
                    lista.insereOrdenado(temp.getElemento());
                    temp = temp.getProx();
                    temp2 = temp2.getProx();
                } else if(temp.getElemento() < temp2.getElemento()) {
                    lista.insereOrdenado(temp.getElemento());
                    temp = temp.getProx();
                } else {
                    lista.insereOrdenado(temp2.getElemento());
                    temp2 = temp2.getProx();
                }
            } else {
                lista.insereOrdenado(temp.getElemento());
                temp = temp.getProx();
            }
        }
        while(temp2 != null) {
            lista.insereOrdenado(temp2.getElemento());
            temp2 = temp2.getProx();
        }
        
        return lista;
    }
    
    // método que recebe duas listas e retorna uma lista com a intersecção das duas
    public static ListaEncadeada interseccaoListas(ListaEncadeada lista1, ListaEncadeada lista2) {
        No temp = lista1.ini;
        No temp2 = lista2.ini;
        ListaEncadeada lista = new ListaEncadeada();
        while(temp != null) {
            while(temp2 != null) {
                if(temp.getElemento() == temp2.getElemento()) {
                    lista.insereOrdenado(temp.getElemento());
                }
                temp2 = temp2.getProx();
            }
            temp2 = lista2.ini;
            temp = temp.getProx();
        }
        return lista;
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
