package com.example.learnjava;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        int[] numbers = {12, 0, 43, 54, 9, 59, 74, 75, 7, 82, 82, 100000, 87654};
        findMultThree(numbers);
    }

    public static void findMultThree(int[] nums) {

        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 3 == 0) {
                    System.out.println(nums[i] + " is a multiple of 3");
                } else {
                    System.out.println(" x " + nums[i] + " is not a multiple of 3");
                }
            }
        } else {
            System.out.println("Empty array");
        }

    }






















//        int[] myArray = {1, 33, 4, 12, 89, 98, 90, 12, 43, 1234};
//        String[] names = {"James", "Anthony", "Rodrigo", "Nirai"};
//
//        int[] newArray = new int[4];
//        String[] newNames = new String[5];
//
//        newArray[0] = 12;
//        newArray[1] = 13;
//        newArray[2] = 133;
//        newArray[3] = 113;
//
//        newNames[0] = String.valueOf(12);
//        newNames[1] = String.valueOf(39);
//        newNames[2] = String.valueOf(50);
//        newNames[3] = String.valueOf(60);
//        newNames[4] = String.valueOf(76);
//
//
//        for (int i = 0; i < newNames.length; i++) {
//            System.out.println("Items: " + newNames[i]);
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Names: " + names[i]);
//        }
//
////        ArrayList<String> name = new ArrayList<>();
//        ArrayList name = new ArrayList();
//        name.add("Bond");
//        name.add("James");
//        name.add("Bonny");
//        name.add("Arnold");
//
//        System.out.println(name.get(3));
//
////        for (int i = 0; i < name.size(); i++) {
////            System.out.println("Names: " + name.get(i));
////        }
//
//        for (Object n : name) {
//
//            System.out.println("Names: " + n);
}


//        int a = 12;
//        String myString = "";
//        boolean isEmpty = myString.isEmpty();
//        boolean contains = myString.contains("h");
//
//        if (contains) {
//            System.out.println("Yes contains h");
//        } else {
//            System.out.println("No h");
//        }
//
//        if (!isEmpty) {
//            System.out.println(myString);
//        } else {
//            System.out.println("Empty");
//        }
//
//
//        Employee employee = new Employee();
//
//        employee.setName("James");
//        employee.setLastName("Bond");
//        employee.setAge(45);
//        employee.setId(12245459);
//        employee.setAnnualSalary(100000);
//
////        System.out.println();
//
//        Manager manager = new Manager();
//        manager.setName("Manager George");
//        manager.setLastName("Kilos");
//        manager.setAge(35);
//        manager.setId(456);
//        manager.setAnnualSalary(45000);

//        System.out.println(manager);

//        System.out.println(manager.getAnnualSalary() + " , "
//        + manager.getFirstName() + " Id: " + manager.getId() + " , " + manager.getAge());




//        Microphone microphone = new Microphone("Blue Yeti", "Blue", 365);
//
//        String name = "Lucy";
//
//        System.out.println(Math.PI);
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Hey my name is " + name);
//        stringBuilder.append(" and I'm 45 years old!");
//
//        System.out.println(stringBuilder);
//
//        microphone.setModel(87);
//        microphone.setName("New Blue Yeti");
//        microphone.setColor("Red Blue");
//
//        System.out.println("New Mic: " + microphone.getModel());
//
//        microphone.turnOn();
//        microphone.setVolume();
//        microphone.turnOff();
//
//        System.out.println(microphone.showDescription());
//
//        Microphone newMic = new Microphone("NewMic", "Green", 123);
//        Microphone otherMic = new Microphone();
//        otherMic.setColor("Other Mic");
//
//
//        Microphone grandMic = new Microphone("Grand", "Yellow");
//
//
//        System.out.println(otherMic.getColor());
