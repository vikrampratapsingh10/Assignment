package com.testio;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFile {
    public static void main(String[] args) {
        System.out.println("Hello. ");
        File f = new File("/home/pawan/Documents/j2se-4/file-io/abc.txt");
        
        if(!f.exists()){ 
            try {
                f.createNewFile();
            } catch (IOException ex) {
              ex.printStackTrace();
            }
        }
        else
            System.out.println("File  Found");
    }
}
