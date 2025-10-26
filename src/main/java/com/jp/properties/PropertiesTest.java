package com.jp.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        File f = new File("db.properties");
        if(!f.exists())
            f.createNewFile();
        Properties properties = new Properties();

        /*
        properties.setProperty("url","localhost");
        properties.setProperty("username","root");
        properties.setProperty("password","root");

        FileOutputStream fos = new FileOutputStream(f);
        properties.store(fos,"DB Details");
        System.out.println("property file create and stored the data");*/

        //reading the data from db.properties
        FileInputStream fis = new FileInputStream(f);
        properties.load(fis);
        //reading only keys
        System.out.println("using stringPropertyNames ");
      Set<String> keys =  properties.stringPropertyNames();
      for (String key : keys)
      {
          System.out.println(key);
      }
        System.out.println("Using keyset");

      Set<Object> keysUsingKeySet = properties.keySet();
      for (Object key :keysUsingKeySet)
      {
          System.out.println((String)key);
      }

        System.out.println("Reading the values");
        Collection<Object> values =  properties.values();

        for (Object value :values)
        {
            System.out.println((String)value);
        }

        System.out.println("Reading entry");

        Set<Map.Entry<Object,Object>> entries = properties.entrySet();

        for (Map.Entry entry:entries)
        {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }


    }
}
