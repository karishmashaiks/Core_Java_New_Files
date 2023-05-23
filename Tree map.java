package org.example;

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)
    {
       TreeMap<Integer,String> myMap = new TreeMap<Integer,String>();

                myMap.put (100, "Tom");
                myMap.put (333, "dick");
                myMap.put (222, "Harry");
                myMap.put (121, "sam");
                System.out.println(myMap.get(333));
                System.out.println(myMap);
                Set mySet = myMap.entrySet();
                System.out.println(mySet);

                Iterator it = mySet.iterator();
                while(it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    System.out.println("Key is "+entry.getValue());


    }

    }
}