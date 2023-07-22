package com.testio;

import java.io.FileWriter;

public class TestWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("/home/pawan/Documents/j2se-4/file-io/xyz.txt");
            fw.write("Java is very Simple...");
            
            System.out.println("Operation Success");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                fw.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
