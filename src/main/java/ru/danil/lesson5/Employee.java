package ru.danil.lesson5;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Ф.И.О:" + " " + fullName);
        System.out.println("Должность:" + " " + jobTitle);
        System.out.println("Пчта:" + " " + email);
        System.out.println("Телефон:" + " " + telephone);
        System.out.println("Зарплата:" + " " + salary);
        System.out.println("Возраст:" + " " + age);
        System.out.println();
    }
}
