package org.lessons.java.snacks;

public class Snack3 {
    /*
        Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione (indice) dispari
    */
    public static void main(String[] args) {
        // arrays per indice dispari:
        int[] arr = {0, 1, 0, 2, 0, 3, 0, 4, 0, 5}; // output aspettato: 1 + 2 + 3 + 4 + 5 = 15
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // output aspettato: 2 + 4 + 6 + 8 + 10 = 30

        // arrays per indice pari:
//        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5, 0}; // output aspettato: 1 + 2 + 3 + 4 + 5 = 15
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // output aspettato: 1 + 3 + 5 + 7 + 9 = 25

        int sum = 0;
        boolean isEvenIndex = false;

/*
        // indice pari
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
            isEvenIndex = true;
        }
*/

        // indice dispari:
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) sum += arr[i];
        }

        String strOddOrEven = isEvenIndex ? "pari" : "dispari";
        System.out.println("La somma degli elementi in posizione (indice) " + strOddOrEven + " è: " + sum);
    }
}
