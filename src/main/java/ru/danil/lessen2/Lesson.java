package ru.danil.lessen2;

public class Lesson {
    public static void main(String[] args) {
        byte k = 2;
        short p = 3;
        int j = 5;
        long g = 6;
        char f = 'h';
        float m = 3.5f;
        double n = 5.7;
        boolean v = true;
        calculation(5, 6, 8, 2);
        isTheAmountWithin();
        positiveOrNegativeNumber(2);
        enterMessage("lexa");
        negativeOrPositive(4);
        leapYear(8);
    }

    static int calculation(int a, int b, int c, int d) {
        int summ = a * (b + (c / d));
        return (summ);
    }

    static void isTheAmountWithin() {
        int x = 4;
        int z = 12;
        int xz = x + z;
        if (xz >= 10 || xz <= 20) {
            System.out.println("верно");
        } else {
        }
    }

    static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else if (a <= 0) {
            System.out.println("отрицательное");
        }
    }

    static boolean negativeOrPositive(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    static void enterMessage(String name) {
        System.out.println("привет" + " " + name);
    }
    static void leapYear(int a){
        if (a % 4 == 0 && a % 100 != 0){
            System.out.println("высокосный год");
        }
        else if(a == 400){
            System.out.println("высокосный год");
        }
        else{
            System.out.println("невысокосный год");
        }
    }
}




