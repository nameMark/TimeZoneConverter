package com.company;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss ");


        long yourTimeZoneHour = date.getHours();
        long yourTimeZoneMinutes = date.getMinutes();
        long yourTimeZoneSeconds = date.getSeconds();

        System.out.println(yourTimeZoneHour + " hours " +
                yourTimeZoneMinutes + " minutes " + yourTimeZoneSeconds + " seconds" + " passed this day :D");

        int timeZone = date.getTimezoneOffset();
        System.out.println(timeZone);

        ZonedDateTime.now(           // Capture the current moment in the wall-clock time used by the people of a certain region (a time zone).
                ZoneId.systemDefault()   // Get the JVM’s current default time zone. Can change at any moment during runtime. If important, confirm with the user.
        );                            // Renders


        Hashtable <String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        System.out.println(numbers.get("one"));


        Integer n = numbers.get("two");
        if (n != null) {
            System.out.println("two = " + n);
        }


        

        }
    }
