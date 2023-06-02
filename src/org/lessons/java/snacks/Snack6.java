package org.lessons.java.snacks;

public class Snack6 {
    /*
        Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
        Possibile usare solo :
        - cicli
        - chartAt
        - if / switch
        Es. “25" come stringa deve essere convertito in intero 25.
    */
    public static void main(String[] args) {
        String numString = "25";

        // Variabile booleana per stampare il numero solamente se la stringa iniziale contiene solo caratteri numerici
        boolean isNumString = true;

        // Inizializzo variabile del numero che voglio ottenere come output finale
        int numInt = 0;

        for (int i = 0; i < numString.length(); i++) {
            char numChar = numString.charAt(i);
            int num = 0;

            if (numChar >= '0' && numChar <= '9') {
                // switch case per convertire tutti i caratteri stringa in caratteri numerici
                switch (numChar) {
                    case '0':
                        num = 0;
                        break;
                    case '1':
                        num = 1;
                        break;
                    case '2':
                        num = 2;
                        break;
                    case '3':
                        num = 3;
                        break;
                    case '4':
                        num = 4;
                        break;
                    case '5':
                        num = 5;
                        break;
                    case '6':
                        num = 6;
                        break;
                    case '7':
                        num = 7;
                        break;
                    case '8':
                        num = 8;
                        break;
                    case '9':
                        num = 9;
                        break;
                }
                numInt = numInt * 10 + num;
            } else {
                isNumString = false;
                System.out.println("La stringa " + "\"" + numString + "\"" + " contiene caratteri non numerici");
                break;
            }
        }
        if (isNumString) System.out.println(numInt);
    }
}
