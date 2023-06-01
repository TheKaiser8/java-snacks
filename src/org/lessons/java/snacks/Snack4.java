package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack4 {
    /*
        Data in input una stringa verificare se è palindroma
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Scrivi una stringa per verificare se è palindroma o no: ");
        String str = scan.nextLine();
        // Rimuovo tutti i caratteri che non sono numeri o lettere e converto la stringa in minuscolo
        String strNormalized = str.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(); // la regex [^a-zA-Z0-9] escludeva i caratteri accentati per cui creava dei bug
        // Sostituisco i caratteri accentati contenuti nella stringa con le rispettive lettere non accentate
        String strWithoutAccents = strNormalized.replaceAll("[èé]", "e").replaceAll("[àá]", "a").replaceAll("[ìí]", "i").replaceAll("[òó]", "o").replaceAll("[ùú]", "u");
        System.out.println(strWithoutAccents);

/*
        // Soluzione NON efficiente (la concatenazione di stringhe con l'operatore += comporta la creazione di un nuovo oggetto String ad ogni iterazione)
        String strReverse = "";
        for (int i = strWithoutAccents.length() - 1; i >= 0; i--) {
            char letter = strWithoutAccents.charAt(i);
            strReverse += letter;
        }
        System.out.println(strReverse);

        // Creo variabile result con operatore ternario per NON duplicare codice output finale
        String result = strReverse.equals(strWithoutAccents) ? " è " : " NON è ";
*/

        // Soluzione più efficiente con StringBuilder
        StringBuilder strReverseBuilder = new StringBuilder();
        for (int i = strWithoutAccents.length() - 1; i >= 0; i--) {
            char letter = strWithoutAccents.charAt(i);
            strReverseBuilder.append(letter);
        }
        System.out.println(strReverseBuilder);

        // Creo variabile result con operatore ternario per NON duplicare codice output finale
        // Utilizzo metodo toString() per rappresentare l'oggetto della classe StringBuilder come oggetto String e poter confrontare i 2 oggetti con il metodo equals()
        String result = strReverseBuilder.toString().equals(strWithoutAccents) ? " è " : " NON è ";

        System.out.println("La stringa " + "\"" + str + "\"" + result + "palindroma!");
    }
}
