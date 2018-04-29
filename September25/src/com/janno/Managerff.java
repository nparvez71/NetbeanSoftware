package com.janno;

public class Managerff extends Employee {

    private String departmentName;

    public Managerff(String departmentName, String name, double salary) {
        //super constructor added
        super(name, salary);
        this.departmentName = departmentName;
    }

    public String getDetails() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", departmentName=" + departmentName + '}';
    }

}
