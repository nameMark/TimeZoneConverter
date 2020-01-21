package com.company;
import java.util.Dictionary;
import java.util.*;



public class timeZone {
    public static void main(String[] args) {

        Dictionary dictionary = new Hashtable();

        // put() method
        dictionary.put("123", "Code");
        dictionary.put("456", "Program");

        // elements() method :
        for (Enumeration i = dictionary.elements(); i.hasMoreElements();)
        {
            System.out.println("Value in Dictionary : " + i.nextElement());
        }
    }

}