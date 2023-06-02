package org.lessons.java.snacks;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Snack7 {

    // Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)

    public static void main(String[] args) {
        int totalSeconds = 12345;

        int hours = totalSeconds / 3600; // ottengo le ore contenute in totalSeconds
        int secondsHourRest = totalSeconds % (60 * 60); // ottengo i secondi di resto
        int minutes = secondsHourRest / 60; // ottengo i minuti contenuti in secondsHourRest
        int seconds = secondsHourRest % 60; // ottengo i secondi come resto dei minuti

        // Formato output: ore minuti e secondi con almeno 2 cifre
        NumberFormat numberFormat = new DecimalFormat("00");
        System.out.println("Ora (formato hh:mm:ss): " + numberFormat.format(hours) + ":" + numberFormat.format(minutes) + ":" + numberFormat.format(seconds));
    }
}
