package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack1 {
    /*
        Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int n = scan.nextInt();

        if(n % 2 == 0) System.out.println("Inserito numero pari: " + n);
        else {
            n += 1;
            System.out.println("Inserito numero dispari, per cui ottengo: "  + n);
        }
    }
}
