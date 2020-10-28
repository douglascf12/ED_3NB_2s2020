package Aula_12_ADO_04_Pilha;

public class BatataQuente {
    public static void main(String[] args) throws Exception {
        Fila f = new Fila();
        
        f.enqueue("Douglas");
        f.enqueue("Caio");
        f.enqueue("Miguel");
        f.enqueue("Savio");
        f.enqueue("Débora");
        f.enqueue("Eduardo");
        f.enqueue("João");
        System.out.println(f);
        Object vencedor = batataQuente(f, 10);
        System.out.println("O vencedor é: " + vencedor);
    }
    
    public static Object batataQuente(Fila f, int k) throws Exception {
        Fila temp = f;
        while(temp.size() > 1) {
            for(int i = 0; i < k; i++) {
                Object item = temp.dequeue();
                temp.enqueue(item);
            }
            System.out.println("Saiu ===> " + temp.dequeue());
        }
        return temp.dequeue();
    }
}
