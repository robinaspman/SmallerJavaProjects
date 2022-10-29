package com.example.javaobjects;

public class JavaObjectsAsMethodParameters {
    public static void main(String[] args) {

        Employer bank = new Employer();

        Employee Jenna = new Employee("Jenna", "Lassoft",
                3242424, "HR", "Recruiter", 4500.89);
        Employee Lance = new Employee("Lance", "Lassoft",
                3443565, "IT", "IT/Support", 3800.89);

        bank.calculateAnnualBonus(Jenna);
        bank.calculateAnnualBonus(Lance);
        bank.employeeDetails(Lance);

        boolean related = bank.areRelated(Jenna, Lance);
        System.out.println(related);

    }
}