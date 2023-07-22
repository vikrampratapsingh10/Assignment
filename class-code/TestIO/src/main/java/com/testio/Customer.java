package com.testio;

public class Customer {
  private int id;
  private String name;
  private String mobile;
  private int age;
  private String address;

    public Customer(int id, String name, String mobile, int age, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.address = address;
    }

    public Customer() {
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  
     
}
