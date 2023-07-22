package com.testio;

import java.io.Serializable;

public class Employee implements Serializable{
  private int id;
  private String name;
  transient private String department;
  private int salary;
  private String address;
  private String mobile;

    public Employee(int id, String name, String department, int salary, String address, String mobile) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.address = address;
        this.mobile = mobile;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
  
}
