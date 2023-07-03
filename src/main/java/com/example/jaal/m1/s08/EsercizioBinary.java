package com.example.jaal.m1.s08;

//serve per: dati ordinati, controllare la presenza di un valore int/stringa

public class EsercizioBinary {
    public static int binarySearch(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

//binarysearch, sono 2 metodi con lo stesso nome ma il chiamato (array, int ecc) sono diversi
    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int middle = left + (right - left) / 2; // punto centrale
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] < target) {
            return binarySearch(nums, middle + 1, right, target);
        } else {
            return binarySearch(nums, left, middle - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 6, 9 };
        int pos = binarySearch(array, 6); // cerchiamo l'indice
        System.out.println(pos);
    }
}
