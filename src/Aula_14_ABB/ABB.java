package Aula_14_ABB;

public class ABB {
    private No raiz;
    
    // cria uma árvore vazia
    public ABB() {
        this.raiz = null;
    }
    
    // verifica se a árvore está vazia
    public boolean vazia() {
        return this.raiz == null;
    }
    
    public void insere(int elemento) {
        No novo = new No(elemento, null, null);
        No pai = null;
        No p = raiz;
        
        // buscar onde inserir o novo nó
        while(p != null) {
            pai = p;
            if(elemento < p.getElemento()) {
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
        }
        
        // verifica se a árvore está vazia
        if(vazia()) {
            raiz = novo;
            return;
        }
        if(elemento < pai.getElemento()) {
            pai.setEsq(novo);
        } else {
            pai.setDir(novo);
        }
    }
    
    public void insereR(int elemento) {
        // verifica se a árvore está vazia
        if(vazia()) {
            raiz = new No(elemento, null, null);
            return;
        }
        No novo = new No(elemento, null, null);
        insereR(raiz, novo);
    }
    
    public void insereR(No p, No novo) {
        if(novo.getElemento() < p.getElemento()) {
            if(p.getEsq() == null) {
                p.setEsq(novo);
            } else {
                insereR(p.getEsq(), novo);
            }
        } else {
            if(p.getDir() == null) {
                p.setDir(novo);
            } else {
                insereR(p.getDir(), novo);
            }
        }
    }
    
    public void preOrdem() {
        preOrdem(raiz);
    }
    
    public void preOrdem(No p) {
        if(p != null) {
            System.out.print(p.getElemento() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }
    
    public void inOrdem() {
        inOrdem(raiz);
    }
    
    public void inOrdem(No p) {
        if(p != null) {
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + " ");
            inOrdem(p.getDir());
        }
    }
    
    public void posOrdem() {
        posOrdem(raiz);
    }
    
    public void posOrdem(No p) {
        if(p != null) {
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + " ");
        }
    }
    
    public No buscaIt(int elemento) {
        No p = raiz;
        while(p != null) {
            if(elemento == p.getElemento()) {
                return p; // achou
            }
            if(elemento < p.getElemento()) {
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
        }
        return null; // não achou
    }
    
    public No buscaR(int elemento) {
        return buscaR(raiz, elemento);
    }
    
    public No buscaR(No p, int elemento) {
        if(p == null) {
            return null; // não achou
        }
        if(elemento == p.getElemento()) {
            return p; // achou
        }
        if(elemento < p.getElemento()) {
            return buscaR(p.getEsq(), elemento);
        } else {
            return buscaR(p.getDir(), elemento);
        }
    }
    
    public No maiorIt() {
        No p = raiz;
        while(p.getDir() != null) {
            p = p.getDir();
        }
        return p;
    }
    
    public No maior() {
        return maior(raiz);
    }
    
    public No maior(No p) {
        if(p.getDir() == null) {
            return p;
        }
        return maior(p.getDir());
    }
    
    public No menorIt() {
        No p = raiz;
        while(p.getEsq() != null) {
            p = p.getEsq();
        }
        return p;
    }
    
    public No menor() {
        return menor(raiz);
    }
    
    public No menor(No p) {
        if(p.getEsq() == null) {
            return p;
        }
        return menor(p.getEsq());
    }
    
    // método que remove um nó na ABB
    public No remove(int elemento) {
        return remove(raiz, elemento);
    }
    
    public No remove(No p, int elemento) {
        if(p == null) {
            return null; // não achei
        }
        
        if(elemento < p.getElemento()) {
            p.setEsq(remove(p.getEsq(), elemento));
        } else if(elemento > p.getElemento()) {
            p.setDir(remove(p.getDir(), elemento));
        } else {
            // verifica se o elemento será removido tem subárvore esquerda
            if(p.getEsq() != null) {
                // busca o maior na subárvore esquerda
                No aux = maior(p.getEsq());
                // copia o elemento maior da subrarvore esq para p
                p.setElemento(aux.getElemento());
                // remove elemento copiado recursivamente
                p.setEsq(remove(p.getEsq(), aux.getElemento()));
            } else if(p.getDir() != null) { // verifica se o elemento será removido tem subarove direita
                // busca o menor na subárvore esquerda
                No aux = menor(p.getDir());
                // copia o elemento maior da subrarvore esq para p
                p.setElemento(aux.getElemento());
                // remove elemento copiado recursivamente
                p.setDir(remove(p.getDir(), aux.getElemento()));
            } else {
                // verifica se é folha
                return null;
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return "ABB{" + "raiz=" + raiz + '}';
    }
    
}
