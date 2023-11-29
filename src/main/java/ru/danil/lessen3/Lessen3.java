package ru.danil.lessen3;

import java.util.Random;
import java.util.Scanner;

public class Lessen3 {
    public static void main(String[] args) {
        guessTheNumber();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        guessTheWord(words);
    }

    static void guessTheNumber() {
        Random random = new Random();
        int nomber1 = random.nextInt(10);

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число от 0 до 10");
            int nomber = scanner.nextInt();
            if (nomber1 == nomber) {
                System.out.println("вы ввели верное число");
                break;
            }
            if (nomber1 > nomber) {
                System.out.println("введеное число больше");
            }
            if (nomber1 < nomber) {
                System.out.println("введеное число меньше");
            }
        }
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет» ");

    }

    static void guessTheWord(String[] words) {
        Random random = new Random();
        int a = random.nextInt(words.length);
        System.out.println(a);
        System.out.println("система загодала слово");
        System.out.println("напишите  слово");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (words[a] == word) {
            System.out.println("верное слово");
        }
        if (words[a] != word) {
            word.charAt(0);
            System.out.println( words[a].charAt(0));
        }
    }
}


