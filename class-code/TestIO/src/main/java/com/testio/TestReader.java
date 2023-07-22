package com.testio;

import java.io.FileReader;

public class TestReader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("/home/pawan/Documents/j2se-4/file-io/abc.txt");
            String data = "";
            while(true){
                int x = fr.read();
                if(x == -1)
                    break;
                data  = data + (char)x;
            }
            System.out.println(data);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
