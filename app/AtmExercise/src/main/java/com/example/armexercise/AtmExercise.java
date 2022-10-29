package com.example.armexercise;

public class AtmExercise {
    public static void main(String[] args) {
       String command = "Deposit";
       int balance = 1000;
       int amount = 100;

        switch (command) {
            case "Withdraw":
                balance -= amount;
                break;
            case "Deposit":
                balance += amount;
                break;
            default:
                System.out.println("Please choose a command!");
                break;
        }
        System.out.println("Your balance used to be 1000 and is now " + balance);
    }
}