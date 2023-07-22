package com.testio;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestOOS {
    public static void main(String[] args) {
        try{
            FileOutputStream fout =new FileOutputStream("/home/pawan/Documents/j2se-4/file-io/customer.txt",true);
            
            ObjectOutputStream oos = new ObjectOutputStream(fout);
           
            Employee e = new Employee(101, "Peeku", "Developement", 150000, "Scheme no 51, indore", "9009111222");
            
            oos.writeObject(e);
            
            System.out.println("Operation Success...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
