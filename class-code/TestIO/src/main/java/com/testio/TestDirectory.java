package com.testio;


import java.io.File;

public class TestDirectory {
    public static void main(String[] args) {
        File f = new File("/home/pawan/Documents/j2se-4");
        File files[] = f.listFiles();
        
        for(File fileItem : files)
           if(fileItem.isFile()) 
            System.out.println(fileItem.getName());
    }
    
}
