package com.coderbd.wraperclass;

public class App1 {

    public static void main(String[] args) {
        Carsur carsur = new Carsur("parvez", 25, 25000.0, "hr");

        System.out.println("name:-" + carsur.getName() + "\n"
                + "avg" + carsur.getAvg() + "\n"
                + "salary" + carsur.getSalary() + "\n"
                + "departname" + carsur.getDepartname());

    }

}
