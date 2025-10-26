package com.jp.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        File f = new File("D:/spring-core-program/java-practices/resume.txt");
       //System.out.println(f.createNewFile());
     //   System.out.println(f.delete());
        //System.out.println(f.exists());

        /*if(f.exists())
            f.delete();
         f.createNewFile();*/

    //    System.out.println(f.isHidden());
        /*System.out.println(f.canRead());
        f.setWritable(true);
        System.out.println(f.canRead());*/

        //System.out.println(f.getAbsoluteFile());

       // System.out.println(f.getName());

        File f1 = new File("./Resources/test/");
        //System.out.println();
       // System.out.println(f1.mkdir());
        //System.out.println(f1.mkdirs());
        //File f2 = new File(f1.getPath()+"/resume2.docx");
        //f2.createNewFile();

        //System.out.println(f1.delete());
      //  File f3 = new File("D:\\spring-core-program\\java-practices");
        //System.out.println(Arrays.toString(f3.listFiles()));



    };
}
