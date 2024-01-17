package ru.danil.lesson6;

public class Dog extends Animal {
    public void run(int distance){
        if(distance > 500){
            System.out.println("сабака столько не бегает");
            return;
        }
        System.out.println("сабака пробежала "+ distance);
    }
    public void swim(int distance){
        if (distance > 10){
            System.out.println("сабака столько не плавает");
            return;
        }
        System.out.println("сабака пробежала "+ distance);
    }
}
