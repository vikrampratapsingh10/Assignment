package com.testio;

import java.io.FileWriter;

public class TestWriter2 {
    public static void main(String[] args) {
        try(FileWriter fw = 
                new FileWriter("/home/pawan/Documents/j2se-4/file-io/xyz.txt");){
            fw.write("Java is platform independent..");
            System.out.println("Operation Success");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
