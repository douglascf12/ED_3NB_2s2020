/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_ADO_04_Pilha;

/**
 *
 * @author douglascf12
 */
public class testaFila {
    public static void main(String[] args) throws Exception {
        Fila f = new Fila();
        
        f.enqueue(7);
        f.enqueue(3);
        f.enqueue(5);
        f.enqueue(8);
        System.out.println(f);
        System.out.println(f.size());
        System.out.println(f.dequeue());
        System.out.println(f.dequeue());
        System.out.println(f.size());
    }
}
