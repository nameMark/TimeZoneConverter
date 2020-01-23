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








package com.company;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.text.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss ");
        Scanner scanner = new Scanner(System.in);



        long yourTimeZoneHour = date.getHours();
        long yourTimeZoneMinutes = date.getMinutes();
        long yourTimeZoneSeconds = date.getSeconds();

        System.out.println("your time plus one hour " + yourTimeZoneHour+1);
        System.out.println(yourTimeZoneHour + " hours " +
                yourTimeZoneMinutes + " minutes " + yourTimeZoneSeconds + " seconds" + " passed this day :D");



        String en = scanner.nextLine();

        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        System.out.println(numbers.get(en));


        Integer n = numbers.get(en);
        if (n != null)
            System.out.println("two = " + n);
        
    }
}
