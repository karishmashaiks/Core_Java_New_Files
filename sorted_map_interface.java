package org.example;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)
    {
        SortedMap<Integer, String> smap = new TreeMap<>();
        smap.put(2, "Two");
        smap.put(4, "Four");
        smap.put(3, "Three");
        smap.put(1, "One");
        System.out.println("map content is : " + smap);
    }
}