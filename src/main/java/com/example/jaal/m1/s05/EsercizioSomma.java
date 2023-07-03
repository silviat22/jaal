package com.example.jaal.m1.s05;

public class EsercizioSomma {
    public static int sum(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6 };
        int result = EsercizioSomma.sum(numbers); // = sum(numbers)
        System.out.println(result);

    }
}
