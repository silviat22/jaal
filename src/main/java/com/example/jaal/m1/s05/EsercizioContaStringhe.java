package com.example.jaal.m1.s05;

public class EsercizioContaStringhe {
    public static int countEquals(String[] values, String target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(target)) { // confrontare 2 oggetti per uguaglianza si fa con equals nelle stringhe
                count += 1; // incrementare variabile d'appoggio di 1 per dare il risultato: count = count +
                            // 1
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] names = { "cat", "dog", "dog", "horse", "dog" };
        String target = "dog";
        int count = countEquals(names, target);
        System.out.println(count);
    }
}