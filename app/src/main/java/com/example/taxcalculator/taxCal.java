package com.example.taxcalculator;

public class taxCal {
    private double salary;

    public taxCal() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculation() {
        double tamount = 0;
        if (salary <= 200000) {
            tamount  = (salary / 100) * 1;
        } else if (salary > 200000 && salary <= 350000) {
            double Tax1 = (200000 / 100) * 1;
            double remSalary= salary - 200000;
            double  Tax2 = (remSalary / 100) * 15;
            tamount = Tax1 + Tax2;
        } else if (salary > 350000) {
            double Tax1 = (200000 / 100) * 1;
            double Tax2 = (150000 / 100) * 15;
            double remSalary = salary - 350000;
            double Tax3 = (remSalary/100)*25;
            tamount= Tax1 + Tax2 + Tax3;
        }
        return tamount;
    }
}
