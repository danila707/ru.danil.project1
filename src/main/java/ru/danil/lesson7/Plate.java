package ru.danil.lesson7;

public class Plate {
    int food;
    public  Plate (int food){
        this.food = food;
    }
    public void info(){
        System.out.println("plate " + food);
    }
    public void decreaseFood(int appetit) {
           food -= appetit;
    }
    public void additive(){
        food += 100;
    }
}
