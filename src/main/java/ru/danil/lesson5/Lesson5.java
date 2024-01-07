package ru.danil.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Андрей", "Инженер", "ivanov@mail.ru", "89214657843", 30000, 39);
        persArray[1] = new Employee("Сидоров Иван", "Инженер", "sidorov@mail.ru", "89325467893", 42000, 45);
        persArray[2] = new Employee("Клушин Александр", "Дворник", "klushin@mail.ru", "89994567213", 28000, 41);
        persArray[3] = new Employee("Петров Олег", "Сантехник", "petrov@mail.ru", "89316457891", 34000, 38);
        persArray[4] = new Employee("Катков Юрий", "Кладовщик", "katkov@mail.ru", "89213467584", 50000, 46);


        for (int i = 0; i < persArray.length;i++){
            if (persArray[i].getAge() > 40){
                persArray[i].info();
            }
        }
    }
}

