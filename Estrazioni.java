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
        int[] A = new int[100];
        int i;
        int valore;
        for (i = 0; i <= 99; i = i + 1) {

            int n = ((int) (Math.random() * 100)) + 1;
            System.out.println(A[i]);

        }

        

    public int max(int[] A) {
        int Max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > Max) {
                Max = A[i];
            }
        }
        return Max;
    }

    public int min(int[] A) {
        int Min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > Min) {
                Min = A[i];
            }
        }
        return Min;
    }

}
