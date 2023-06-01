package org.lessons.java.snacks;

import java.util.Arrays;
import java.util.Scanner;

public class Snack8 {
    /*
       Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validNumber = false;
        int number;

        do {
            System.out.print("Inserisci un numero di 4 cifre: ");
            number = scan.nextInt();
            if (number > 999 && number < 10000) validNumber = true;
        } while (!validNumber);

        System.out.println("Il tuo numero: " + number);

        // Creo array con le cifre del numero
        int[] arr = new int[4];
        arr[0] = number / 1000 % 10;
        arr[1] = number / 100 % 10;
        arr[2] = number / 10 % 10;
        arr[3] = number % 10;

        // Stampa di verifica array generato
        System.out.println(Arrays.toString(arr));

        // Calcolo la somma delle cifre
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("La somma delle cifre del numero " + number + " è: " + sum);
        scan.close();
    }
}
