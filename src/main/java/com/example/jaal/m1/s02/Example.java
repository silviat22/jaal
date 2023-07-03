package com.example.jaal.m1.s02;

import java.util.Arrays;

public class Example { // SWAP
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int temp = a; // così possiamo lavorare su a perchè è al sicuro in temp
        a = b;
        b = temp;
        System.out.println(a + "," + b);

        int[] array = { 1, 9, 7, 3 };
        int temporal = array[0];
        array[0] = array[2];
        array[2] = temporal;
        System.out.println(Arrays.toString(array));

        int index = indexOf(array, 51);
        System.out.println(index);
        System.out.println(contains(array, 9));
        System.out.println(contains2(array, 2));
    }

    public static int indexOf(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains2(int[] data, int target) {
        for (int cur : data) { // semplificata, guarda tutti i valori di data, mettili di volta in volta in
                               // cur, se trovi che cur è = a data, ritorna true
            if (cur == target) {
                return true;
            }
        }
        return false;
    }
}
