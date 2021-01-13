package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("John Peterson","Poland",37,50, (float) 150);
        programmer.about();
        programmer.work();
        programmer.printknowledge();
        System.out.println("My salary is "+programmer.calculateSalary()+" $.");

        System.out.println("\n");
        Manager manager = new Manager("Ana Ionescu","Romania",30,60,(float)120,20);
        manager.about();
        manager.work();
        manager.printHobby();
        System.out.println("My salary is "+manager.calculateSalary() +" $.");

        System.out.println("\n");
        if(programmer.older(manager))
            System.out.println("The programmer is older than the manager!!!");
        else
            System.out.println("The manager is older than the programmer!!!");

    }
}