/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrazioni;

/**
 *
 * @author nicolò
 */
public class Estrazioni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        Vettore v = new Vettore(array);

        v.carica();

        System.out.println(v);
        System.out.println("Il min e': " + v.getMin());
        System.out.println("Il max e': " + v.getMax());
        System.out.println("Il med e': " + v.getAverage());
        System.out.println("La percentuale di PARI e': " + v.getCountPari());
        v.bubbleSort();
        System.out.println(v);

    }

}
