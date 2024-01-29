package ru.danil.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat []cats = new Cat[4];
        cats[0]=new Cat("barsik",30);
        cats[1]=new Cat("slavik",50);
        cats[2]=new Cat("goga",10);
        cats[3]=new Cat("vova",60);
        Plate plate = new Plate(100);
        for (int i = 0;i < cats.length;i++){
            cats[i].eat(plate);
        }
        plate.info();
        plate.additive();
        plate.info();

    }
}
