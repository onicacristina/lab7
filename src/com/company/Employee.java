package com.company;

public abstract class Employee {
    private String name;
    private String country;
    private Integer age;
    private Integer hoursWorked;
    private Float hourlyPayment;

    public Employee(String name, String address, Integer age, Integer hoursWorked, Float hourlyPayment) {
        this.name = name;
        this.country = address;
        this.age = age;
        this.hoursWorked = hoursWorked;
        this.hourlyPayment = hourlyPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Float getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(Float hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    public abstract void work();

    public Float calculateSalary()
    {
        return getHourlyPayment()*getHoursWorked();
    }

    public Boolean older(Employee employee){
        if(this.getAge()>employee.getAge())
            return true;
        return false;
    }


}
