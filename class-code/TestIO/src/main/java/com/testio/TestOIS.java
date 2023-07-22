package com.testio;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestOIS {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("/home/pawan/Documents/j2se-4/file-io/customer.txt");
           
            while(true){
              ObjectInputStream ois = new ObjectInputStream(fin);
              Employee e = (Employee)ois.readObject();
              System.out.println(e.getId()+" "+e.getName()+" "+e.getDepartment()+" "+e.getMobile()+" "+e.getAddress());
              
            }
        }
        catch(Exception e){
            System.out.println("Data End");
        }
    }
    
}
