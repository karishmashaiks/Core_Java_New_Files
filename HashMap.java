package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)
    {

       HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();

        myHashMap.put(100, "Tom");
        myHashMap.put(333, "dick");
        myHashMap.put(222, "Harry");
        myHashMap.put(121, "sam");
        myHashMap.put(121, "sam1");

        System.out.println("HashMap  " +myHashMap);



        TreeMap<Integer, String> myTreeMap = new TreeMap<Integer, String>();

        myTreeMap.put(100, "Tom");
        myTreeMap.put(333, "dick");
        myTreeMap.put(222, "Harry");
        myTreeMap.put(121, "sam");
        myTreeMap.put(121, "sam1 ");

        System.out.println("TreeMap  " +myTreeMap);



        LinkedHashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();

        myMap.put(100, "Tom");
        myMap.put(333, "dick");
        myMap.put(222, "Harry");
        myMap.put(121, "sam");
        myMap.put(121, "sam1");

        System.out.println("LinkedHashMap  " +myMap);

    }
}