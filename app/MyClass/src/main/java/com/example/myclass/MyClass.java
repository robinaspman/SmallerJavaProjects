package com.example.myclass;

public class MyClass {
    public static void main(String[] args) {

        anotherMethod("Hey");
        showName();

    }

    public static void anotherMethod(String something) {
        System.out.println("Another Method " + something);
    }
    public static void showName() {

        for (int i = 0; i < 20; i++) {

            if (i % 3 == 0) {
                System.out.println(i + " is multiple of 3");
            }

        }

        System.out.println("From ShowName");
    }
}