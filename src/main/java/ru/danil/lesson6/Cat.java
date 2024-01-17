package ru.danil.lesson6;

public class Cat extends Animal {


    @Override
    public void run(int distance) {
        if(distance > 200){
            System.out.println("кошка столько не бежит");
            return;
        }
        System.out.println("кошка пробежала "+ distance);
    }

    @Override
    public void swim(int distabce) {
        System.out.println("кошка не умеет плавать");
    }
}