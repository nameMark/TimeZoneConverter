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
        int yourHoursInYourTimeZone;
        int yourMinutesInYourTimeZone;
        int yourSecondsInYourTimeZone;
        int yourHoursInYourTimeZoneNew = 0;

        String houwManyHoursYouWantToAdd;


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









        while (true) {



            System.out.print("How many hours you want to add to your time? :");
            houwManyHoursYouWantToAdd = scanner.nextLine();
            // First String input

            if ((houwManyHoursYouWantToAdd.equals("one")) || (houwManyHoursYouWantToAdd.equals("two")) || (houwManyHoursYouWantToAdd.equals("three")) || (houwManyHoursYouWantToAdd.equals("four")) ||
                (houwManyHoursYouWantToAdd.equals("five")) || (houwManyHoursYouWantToAdd.equals("sixe")) || (houwManyHoursYouWantToAdd.equals("seven")) || (houwManyHoursYouWantToAdd.equals("eight")) ||
                    (houwManyHoursYouWantToAdd.equals("nine")) || (houwManyHoursYouWantToAdd.equals("ten"))){
                Integer n = numbers.get(houwManyHoursYouWantToAdd);
                yourHoursInYourTimeZone = date.getHours();
                yourMinutesInYourTimeZone = date.getMinutes();
                yourSecondsInYourTimeZone = date.getSeconds();




                if (n != null) {
                    if (yourHoursInYourTimeZone + n > 24) {
                        yourHoursInYourTimeZoneNew = (yourHoursInYourTimeZone - 24);
                    }
                    System.out.println(yourHoursInYourTimeZoneNew + n + " hour(s)" + " " + yourHoursInYourTimeZoneNew + " minute(s)" + " " + yourHoursInYourTimeZoneNew + (" second(s)"));
                }

                break;
            }
            System.out.println("Invalid input! Enter value again.:");
        }






    }
}
