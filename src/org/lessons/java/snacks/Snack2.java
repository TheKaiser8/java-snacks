package org.lessons.java.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    /*
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
    */
    public static void main(String[] args) {
        String[] names = { "Aldo", "Giovanni", "Giacomo", "Marina" };
        String[] surnames = { "Baglio", "Storti", "Poretti", "Massironi" };
        String[] falseGuests = new String[names.length];

        Random random = new Random();

        int i = 0;
        while (i < names.length) {
            int randomNameIndex = random.nextInt(names.length);
            int randomSurnameIndex = random.nextInt(surnames.length);
            String fullName = names[randomNameIndex] + " " + surnames[randomSurnameIndex];

            boolean isDuplicate = false;
            for (int j = 0; j < falseGuests.length ; j++) {
                if(fullName.equals(falseGuests[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                falseGuests[i] = fullName;
                System.out.println(fullName);
                i++;
            }

        }

        System.out.println("Falsa lista di invitati: " + Arrays.toString(falseGuests));
    }
}
