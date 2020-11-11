package Aula_14_ABB;

public class testaABB {
    public static void main(String[] args) {
        ABB tree = new ABB();
        
        tree.insere(7);
        tree.insere(2);
        tree.insere(9);
        tree.insere(5);
        tree.insere(4);
        tree.insere(12);
        System.out.println(tree);
        tree.insere(3);
        tree.insere(8);
        System.out.println(tree);
        System.out.print("\nPré-Ordem: ");
        tree.preOrdem();
        System.out.print("\nIn-Ordem: ");
        tree.inOrdem();
        System.out.print("\nPós-Ordem: ");
        tree.posOrdem();
        System.out.print("\n");
        int n = 8;
        if(tree.buscaIt(n) != null) {
            System.out.println("Achou " + tree.buscaIt(n).getElemento());
        } else {
            System.out.println("Não achou " + n);
        }
        
        n = 10;
        if(tree.buscaR(n) != null) {
            System.out.println("Achou " + tree.buscaR(n).getElemento());
        } else {
            System.out.println("Não achou " + n);
        }
        
        System.out.println("Maior: " + tree.maiorIt().getElemento());
        System.out.println("Maior: " + tree.maior().getElemento());
        System.out.println("Menor: " + tree.menorIt().getElemento());
        System.out.println("Menor: " + tree.menor().getElemento());
        
        tree.remove(2);
        System.out.print("\nIn-Ordem: ");
        tree.inOrdem();
    }
}
