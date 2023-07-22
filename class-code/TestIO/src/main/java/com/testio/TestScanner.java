package com.testio;

import java.io.File;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        try{
            File f = new File("/home/pawan/Documents/j2se-4/file-io/abc.txt");
            try{
                Scanner sc = new Scanner(f);
                while(true){
                   String line =  sc.nextLine();
                  System.out.println(line);
                }
            }
            catch(Exception e){
                System.out.println("Data End...");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
