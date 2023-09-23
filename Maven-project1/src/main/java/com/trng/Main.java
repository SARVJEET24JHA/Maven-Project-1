package com.trng;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Employee emp=new Employee();
        emp.setEmpCity("jodhpur");
        emp.setEmpName("sarvjeet");
        emp.setEmpId("12651.65165");
        emp.setEmpSalary("684684");
        System.out.println(emp.getEmpSalary());
    }
}