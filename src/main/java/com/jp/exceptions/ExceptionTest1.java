package com.jp.exceptions;

import java.io.*;

public class ExceptionTest1 {

    public static void main(String[] args) throws Exception {
        File f = new File("D:/spring-core-program/java-practices/resume.txt");
//Any class implements Autocloasable we can write in try with resources
        try(FileInputStream fis = new FileInputStream(f);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr)) {

            if(!f.exists())
                f.createNewFile();


            String txt = "";
            int i = 0;
            while(( i = fis.read()) != -1)
            {
                txt += (char)i;
                //  System.out.print((char)i);

            }

            System.out.println(txt);
           // fis.close();


            //int a[] = {1,2};
            System.out.println(3 / 0);

        }catch (IOException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException a)
        {
            //throw new ArithmeticException("don't divide by zero");
            throw new LoginException("login failed, please check and cerditinal");

        }



    }
}
