package com.example.jaal.m1.s05;

public class EsercizioPari {
    public static int contaPari(int[] array) {
        int pari = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pari += 1; // aggiungere uno (stiamo contando)
            }

        }

        return pari;
    }

    public static void main(String[] args) {
        int[] numeri = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int x = contaPari(numeri); //applicare metodo contapari a array numeri
        System.out.println(x); //risultato 4 numeri pari

    }

}
