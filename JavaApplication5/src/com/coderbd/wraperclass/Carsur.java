package com.coderbd.wraperclass;
public class Carsur {
    private String name;
    private int avg;
    private double salary;
    private String departname="Hr";
    public Carsur(String name, int avg, double salary, String departname) {
        this.name = name;
        this.avg = avg;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAvg() {
        return avg;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartname() {
        return departname;
    }
    
    
    
    
    
}
