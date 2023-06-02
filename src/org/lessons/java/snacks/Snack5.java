package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack5 {
    /*
        Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
        Continuare a chiedere una nuova stringa finchè non si inserisce 0.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;
        String strAlphaOnly;
        String strNumericOnly;
        String strNoAlphaNumeric;

        while (true) {
            System.out.print("Inserisci una stringa: ");
            str = scan.nextLine();

            if (str.equals("0")) {
                break; // per interrompere il ciclo senza visualizzare il risultato quando la stringa inserita è = "0"
            }

            strAlphaOnly = str.replaceAll("[^\\p{L}]", ""); // regex non sostituisce (quindi lascia nella stringa) solo i caratteri ALFABETICI
            strNumericOnly = str.replaceAll("[^\\p{N}]", ""); // regex non sostituisce solo i caratteri NUMERICI
            strNoAlphaNumeric = str.replaceAll("[\\p{L}\\p{N}\\s]", ""); // regex sostituisce tutti i caratteri (spazi inclusi) che NON sono ALFANUMERICI

            // OUTPUT finale
            System.out.println("La stringa " + "\"" + str + "\"" + " contiene " + strAlphaOnly.length() + " caratteri alfabetici, " + strNumericOnly.length() + " numerici e " + strNoAlphaNumeric.length() + " simboli non alfanumerici.");
        }
    }
}
