package com.jp.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {

        File f = new File("D:/spring-core-program/java-practices/resume.txt");
        if(!f.exists())
            f.createNewFile();

        FileInputStream fis = new FileInputStream(f);
        String txt = "";
        int i = 0;
     while(( i = fis.read()) != -1)
        {
            txt += (char)i;
          //  System.out.print((char)i);

        }

        System.out.println(txt);

        fis.close();

    }
}
