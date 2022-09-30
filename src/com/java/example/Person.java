package com.java.example;

public class Person {
    private String name;
    private int age;

    private double money;

    public Person(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }
}