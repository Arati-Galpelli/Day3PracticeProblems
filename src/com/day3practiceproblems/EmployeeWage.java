package com.day3practiceproblems;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage problem...");
        empPresentOrAbsent();
        employeeDailyWage();
    }
    public static void empPresentOrAbsent(){
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random()*10)%2;
        if(empCheck==IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
    public static void employeeDailyWage(){
        int hrs_per_day = 8;
        int wage_per_hr = 20;
        int daily_wage = hrs_per_day * wage_per_hr;
        System.out.println("Daily wage of employee is :"+daily_wage);
    }

}
