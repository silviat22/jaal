package com.example.jaal.m1.s05;

public class EsercizioContatore {
    public static int countLen3(String[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 3) { // se la lunghezza della stringa array è 3
                result += 1;
            }
        }

        return result;

    }
    
    
    public static int countLen3b(String[] array) {
        int result = 0;
        for (String s : array) { //col for each iteriamo sui valori e non sugli indici
            if (s.length() == 3) { // se la lunghezza della stringa array è 3
                result += 1; //aggiungere uno (stiamo contando)
            }
        }

        return result;

    }


    public static void main(String[] args) {
        String[] names = { "Tom", "Bob", "Lucas", "William", "Sam" };
        int count = countLen3(names);
        System.out.println(count);
    }
}