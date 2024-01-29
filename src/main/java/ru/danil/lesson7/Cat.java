package ru.danil.lesson7;

public class Cat {
    private final String name;
    private final int appetit;
    private boolean satiety = true;

    Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }

    public void eat(Plate plate) {
        if ((plate.food - appetit) >= 0) {
            plate.decreaseFood(appetit);
            System.out.println("кот " + name + " поел " +appetit +" "+satiety);
        }
        else {
            System.out.println("коту " + name + "не хватило еды");
        }
    }
}
