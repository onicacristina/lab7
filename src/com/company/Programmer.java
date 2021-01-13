package com.company;

public class Programmer extends Employee{
    private String[] programmingLanguages={"Java","Python","Ruby"};

    public Programmer(String name, String country, Integer age, Integer hoursWorked, Float hourlyPayment) {
        super(name, country, age, hoursWorked, hourlyPayment);
    }

    @Override
    public void work() {
        System.out.println("I am programmer! I write code!");
    }

    public void printknowledge(){
        System.out.println("I know more progamming languages: ");
        for (int i = 0; i <programmingLanguages.length ; i++) {
            System.out.println("\t"+programmingLanguages[i]);
        }
    }

    public void about(){
        System.out.println("Hi! My name is "+getName()+
                            ", I leave in "+getCountry()+
                            " and I am "+getAge()+" years old.");
    }

}
