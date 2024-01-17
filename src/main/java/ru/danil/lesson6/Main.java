package ru.danil.lesson6;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.run(250);
        cat.swim(50);
        dog.swim(50);
        dog.run(300);
        System.out.println(Animal.getCaunt());
    }
}
