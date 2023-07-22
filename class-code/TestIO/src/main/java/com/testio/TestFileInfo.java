package com.testio;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFileInfo {
    public static void main(String[] args) {
        File f = new File("/home/pawan/Documents/j2se-4/file-io/abc.txt");
        System.out.println("File Name : "+f.getName());
        System.out.println("Path  :"+f.getAbsolutePath());
        System.out.println("canRead : "+f.canRead());
        System.out.println("canWrite : "+f.canWrite());
        System.out.println("canExecute : "+f.canExecute());
        System.out.println("size : "+f.length());
        System.out.println("isHidden : "+f.isHidden());
        System.out.println("isFile : "+f.isFile());
        System.out.println("isDirectory : "+f.isDirectory());
        long timestamp = f.lastModified();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yy hh:mm");
        String formattedDate = sd.format(new Date(timestamp));
        System.out.println("Last Modified : "+formattedDate);
    }
    
}
