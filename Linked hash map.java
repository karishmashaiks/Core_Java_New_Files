package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();

        myMap.put(100, "Tom");
        myMap.put(333, "dick");
        myMap.put(222, "Harry");
        myMap.put(121, "sam");
        //System.out.println(myMap.get(333));
        System.out.println(myMap);
        Set mySet = myMap.entrySet();
        System.out.println(mySet);

        if(myMap.containsKey(1211)) {
            System.out.println("Found");
        } else  {
            System.out.println("Not found");
        }

        Iterator it = mySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key is " + entry.getKey());
            System.out.println("value is " + entry.getValue());
        }
    }
}