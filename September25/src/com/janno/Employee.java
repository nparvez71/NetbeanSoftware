package com.janno;
public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public String getDetailsx() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    } 
}
