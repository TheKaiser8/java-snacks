package org.lessons.java.snacks;

public class Snack9 {
    /*
        Calcola la somma e la media dei primi 10 numeri.
    */
    public static void main(String[] args) {
        int n = 10;

/*
        // Metodo 1
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
*/

        // Metodo 2: più efficiente
        int sum = n * (n+1) / 2;

        System.out.println("La somma dei primi " + n + " numeri è: " + sum);
    }
}
