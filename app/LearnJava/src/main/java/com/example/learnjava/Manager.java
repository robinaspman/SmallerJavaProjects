package com.example.learnjava;

public class Manager extends Employee {

    @Override
    public int getAge() {
        return super.getAge() + 10;
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 10000;
    }

    @Override
    public int getId() {
        return super.getId() + 100;
    }

    @Override
    public String toString() {
        return this.getFirstName() + ","
                + this.getId() + ", "
                + this.getAnnualSalary();
    }
}
