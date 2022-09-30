package com.java.example;

import java.util.Scanner;

public class Main {
    private static void getResultVoid(int n1, int n2) { // не является значение
        System.out.println(n1 * n2); //144*44
    }

    private static int getResultInt(int n1, int n2) {
        return n1 * n2;// == число
    }

    private static String getStringFromInt(int n1) {
        return ""+n1;
    }

    public static void main(String[] args) {
                        //144                   //44
//        getResultVoid
//                (getResultInt(getResultInt(getResultInt(), 5), getResultInt(5, 10)), getResultInt(22, 2));

//        Person person = new Person("Mikhail", 37, 10000);
//        System.out.println(person.getAge());
       Scanner scanner  = new Scanner(System.in);

//        System.out.println("Please input the first digit.....");
//        int a1 = scanner.nextInt();
//
//        System.out.println("Please input the second digit.....");
//        int a2 = 100;
//
//
//        System.out.println("Your digits are: " + a1 + " and " + a2);

        //getResultVoid(a1, a2);
//        getResultInt(12, 12); // = 12*12
//        getResultVoid(getResultInt(12, 12), getResultInt(1, 2));
    }
}