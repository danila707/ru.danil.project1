package ru.danil.lessen2;

public class Lesson {
    public static void main(String[] args) {

    }

    public boolean within10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isPozitiveOrNegative(int t) {
        if (t >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год высокосный");
        } else  {
            System.out.println("год не высокосный");
        }

    }
}




