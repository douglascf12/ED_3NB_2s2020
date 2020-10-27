package Aula_10_Pilha;

/**
 *
 * @author douglascf12
 */
public class testaPilha {
    public static void main(String[] args) throws Exception {
        /*
        PilhaVetor p = new PilhaVetor(10);
        System.out.println(p);
        System.out.println(p.vazia());
        p.push(3);
        p.push(5);
        p.push(8);
        System.out.println(p);
        System.out.println(p.vazia());
        System.out.println(p.pop()); // 8
        System.out.println(p.pop()); // 5
        System.out.println(p.size());
        */
        
        Pilha p = new Pilha();
        
        System.out.println(p);
        System.out.println(p.vazia());
        p.push(3);
        p.push(5);
        p.push(8);
        System.out.println(p);
        System.out.println(p.vazia());
        System.out.println(p.pop()); // 8
        System.out.println(p.pop()); // 5
        System.out.println(p.size());
    }
}
