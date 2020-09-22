/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Lista_Ecandeada_ADO_02;

/**
 *
 * @author douglascf12
 */
public class testaNo {
    public static void main(String[] args) {
        No a = new No(5, null);
        System.out.println(a.toString());
        No b = new No(7, a);
        System.out.println(b);
        No c = new No(3, b);
        System.out.println(c);
    }
}
