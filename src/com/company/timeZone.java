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
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss ");
        Scanner scanner = new Scanner(System.in);

        String toWhatTimeYouWantConevert;


        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one",   1);
        numbers.put("two",   2);
        numbers.put("three", 3);
        numbers.put("four",  4);
        numbers.put("five",  5);
        numbers.put("six",   6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine",  9);
        numbers.put("ten",  10);






        String en = scanner.nextLine();


        while (true) {



            System.out.print("How many hours you want to add to your time? :");
            toWhatTimeYouWantConevert = scanner.nextLine();
            // First String input

            if ((toWhatTimeYouWantConevert.equals("plus hour"))){
                Integer n = numbers.get(en);
                int yourTimeZoneHour = date.getHours();


                if (n != null) {
                    System.out.println(yourTimeZoneHour+n + " hours");
                }

                System.out.println(toWhatTimeYouWantConevert);
                break;
            }
            System.out.println("Invalid input! Enter value again.:");
        }






    }
}
