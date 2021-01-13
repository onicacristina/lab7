package com.company;

public class Manager extends Employee {
    private Integer teamSize;
    private String hobby="dancing";

    public Manager(String name, String country, Integer age, Integer hoursWorked, Float hourlyPayment, Integer teamSize) {
        super(name, country, age, hoursWorked, hourlyPayment);
        this.teamSize = teamSize;

    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("I am manager! I manage team of "+getTeamSize());
    }

    public void printHobby()
    {
        System.out.println("I like "+hobby);
    }

    public void about(){
        System.out.println("Hi! My name is "+getName()+
                ", I leave in "+getCountry()+
                " and I am "+getAge()+" years old.");
    }
}
