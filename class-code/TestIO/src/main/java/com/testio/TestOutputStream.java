package com.testio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class TestOutputStream {

    public static void main(String[] args) {
        try {
            File f = new File("/home/pawan/Documents/j2se-4/file-io/abc.txt");

            OutputStream fout = new FileOutputStream(f,true);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Data...");
            String data = sc.nextLine();
     
            byte byteData[] = data.getBytes();
        
            fout.write(byteData);
            
            System.out.println("Operation Success");
        }
        catch(IOException w){
            System.out.println("Something went wrong...");
        }
    }

}
