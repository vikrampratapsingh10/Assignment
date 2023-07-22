package com.testio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {
    public static void main(String[] args) {
        try{
            //File f = new File("/home/pawan/Documents/j2se-4/file-io/abc.txt");
            
            FileInputStream fin = new FileInputStream("/home/pawan/Documents/j2se-4/file-io/abc.txt");
        
            String data = "";
            
            while(true){
              int x =  fin.read();
              if(x == -1)
                  break;
              data = data + (char)x;
            }
            System.out.println(data);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
