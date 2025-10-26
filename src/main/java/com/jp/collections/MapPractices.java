package com.jp.collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapPractices {
    public static void main(String[] args) {


        //Creation of Map
        Map<Integer,String> map = new Hashtable<>();

        //adding the elements to Map
        map.put(500056,"Hyderabad");
        map.put(6231306,"Chennai");
        map.put(123456,"Delhi");

        //get the all keys from the map
        Set<Integer> keys = map.keySet();
        for (Integer key: keys)
        {
            System.out.println("keys--"+key);
        }
        System.out.println();
        //get all values from the map
       Collection<String> values =  map.values();
       for (String value: values)
       {
           System.out.println("values--"+" "+value);
       }

        System.out.println();
       //print the entire  map
        for (Integer key:keys)
        {
            System.out.println("key >>"+" "+key+">> value"+" "+map.get(key));
        }

        //removing the entry in map
        //System.out.println("Before removing --"+map);
        //map.remove(123456,"Delhi");
        //map.remove(123456);
        //System.out.println("After removing----"+map);

        //updation of the map
        //System.out.println("Before updation --"+map);
        //map.put(123456,"Banglore");
        //map.putIfAbsent(123456,"Banglore");
        //System.out.println("After updation --"+map);

        //Verfication
       // System.out.println(map.containsKey(500056));
        //System.out.println(map.containsKey(1232123));
        //System.out.println(map.containsValue("Hyderabad"));
        //System.out.println(map.containsValue("Hyderabad1"));

        System.out.println();
        //Get the elements using entryset
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry entry :entries)
        {
            System.out.println("key---"+entry.getKey()+"value---"+entry.getValue());

        }

    }
}
