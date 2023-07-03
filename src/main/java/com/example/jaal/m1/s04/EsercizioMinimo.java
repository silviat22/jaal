package com.example.jaal.m1.s04;

public class EsercizioMinimo {
    public static int min(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) { //i = 1 e non 0 per non confrontare  numbers di 0 e int i = 0 
            if (result > numbers[i]) { //if(numbers[i] < result, result = numbers[i];
                result = numbers[i];
            }
        }
        return result; //result già definito riga 5
    }

    public static void main(String[] args) {
        int[] values = {2, 8, 4, 9, 4, 2, 6, 3, -18}; //essendo reference, può andarci null
        int result = min(values);
        System.out.println(result);
    }
}
