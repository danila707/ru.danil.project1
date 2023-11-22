package ru.danil.lessen3;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] arrey = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] inpytArrey = {1, 2, 3, 4, 5};
        changeZeroToOne(arrey);
        System.out.println(Arrays.toString(arrey));
        int[] arr = new int[8];
        fillingTheArray(arr);
        System.out.println(Arrays.toString(arr));
        multiplyNumbersLessThanSix();
        int[][] table = new int[5][5];
        fillingArrayDiagonals(table);
        searchForMinimumAndMaximum(arrey);
        hasBalance(arrey);
        rightShift(inpytArrey);
        System.out.println(Arrays.toString(inpytArrey));


    }

    static void changeZeroToOne(int[] arrey) {
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = 1 - arrey[i];

        }
    }

    static void fillingTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    static void multiplyNumbersLessThanSix() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (i < 6) {
                nums[i] *= 2;
            }
        }
    }

    static void fillingArrayDiagonals(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table[i].length - 1 - i] = 1;
        }
    }

    static void searchForMinimumAndMaximum(int[] arrey) {
        int min = arrey[0];
        int max = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (min < arrey[i]) {
                min = arrey[i];
            }
            if (max > arrey[i]) {
                max = arrey[i];
            }
        }
    }

    static boolean hasBalance(int[] arrey) {
        int leftsumm = 0;
        for (int i = 0; i < arrey.length; i++) {
            leftsumm = arrey[i];
            int rightsumm = 0;
            for (int j = (i + 1); j < arrey.length; i++) {
                rightsumm = arrey[j];
            }
            if (leftsumm == rightsumm) {
                return true;
            }
        }
        return false;
    }

    static void rightShift(int[] inpytArrey) {
        int buffer = inpytArrey[0];
        inpytArrey[0] = inpytArrey[inpytArrey.length - 1];
        for (int j = 1; j < (inpytArrey.length - 1); j++) {
            inpytArrey[inpytArrey.length - j] = inpytArrey[inpytArrey.length - j - 1];
        }
        inpytArrey[1] = buffer;
    }
}
