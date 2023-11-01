package ru.danil.lessen2;

public class Main {
    public static void   main(String[] args) {
        Lesson lesson = new Lesson();
        System.out.println(lesson.within10and20(5, 10));
        Lesson.isPozitiveOrNegative( 5);
        System.out.println(Lesson.isNegative(5));
        Lesson.printWordNTimes("jfjfjf",10);
        Lesson.isLeapYear( 2022  );
    }
}

