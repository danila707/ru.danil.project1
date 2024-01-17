package ru.danil.lesson6;

public abstract class Animal {
     private static int caunt;
     protected int run;
     protected int swim;
     public Animal(){
          caunt++;
     }
     protected abstract void run(int distance);
     protected abstract void swim(int distance);

     public static int getCaunt() {
          return caunt;
     }
}
