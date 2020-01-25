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
        numbers.put("Alofi", -12);
        numbers.put("Honolulu", -11);
        numbers.put("Juneu", -10);
        numbers.put("Los Angeles", -9);
        numbers.put("San Luis", -8);
        numbers.put("Oklahoma City", -7);
        numbers.put("Washington", -6);
        numbers.put("San Juan", -5);
        numbers.put("Rio de Janeiro", -4);
        numbers.put("King Edward Point", -3);
        numbers.put("Ponta Delgada", -2);
        numbers.put("Lisabon", -1);
        numbers.put("Bratislava", 0);
        numbers.put("Sofia", 1);
        numbers.put("Ankara", 2);
        numbers.put("Dubai", 3);
        numbers.put("Amsterdam Island", 4);
        numbers.put("Dhaka", 5);
        numbers.put("Bangkok", 6);
        numbers.put("Shanghai", 7);
        numbers.put("Tokyo", 8);
        numbers.put("Sydney", 9);
        numbers.put("Kingston", 10);
        numbers.put("Jabat", 11);
        numbers.put("Nukunonu", 12);


        while (true) {


            System.out.print("How many hours you want to add to your time? :");
            houwManyHoursYouWantToAdd = scanner.nextLine();
            // First String input


            if ((   (houwManyHoursYouWantToAdd.equals("Alofi"))
                    || (houwManyHoursYouWantToAdd.equals("Honolulu")) || (houwManyHoursYouWantToAdd.equals("Juneu")) || (houwManyHoursYouWantToAdd.equals("Los Angeles"))
                    || (houwManyHoursYouWantToAdd.equals("San Luis")) ||(houwManyHoursYouWantToAdd.equals("Oklahoma City"))|| (houwManyHoursYouWantToAdd.equals("WashingTon"))|| (houwManyHoursYouWantToAdd.equals("San Juan"))
                    || (houwManyHoursYouWantToAdd.equals("Rio de Janeiro")) || (houwManyHoursYouWantToAdd.equals("King Edward Point")) || (houwManyHoursYouWantToAdd.equals("Ponta Delgada"))
                    || (houwManyHoursYouWantToAdd.equals("Lisabon"))|| (houwManyHoursYouWantToAdd.equals("Bratislava"))|| (houwManyHoursYouWantToAdd.equals("Sofia"))|| (houwManyHoursYouWantToAdd.equals("Ankara"))
                    || (houwManyHoursYouWantToAdd.equals("Dubai"))|| (houwManyHoursYouWantToAdd.equals("Amsterdam Island")) || (houwManyHoursYouWantToAdd.equals("Dhaka")) || (houwManyHoursYouWantToAdd.equals("Bangkok"))
                    || (houwManyHoursYouWantToAdd.equals("Shanghai"))|| (houwManyHoursYouWantToAdd.equals("Tokyo")) || (houwManyHoursYouWantToAdd.equals("Sydney")) || (houwManyHoursYouWantToAdd.equals("Kingston"))
                    || (houwManyHoursYouWantToAdd.equals("Jabat")) || (houwManyHoursYouWantToAdd.equals("Nukunonu")))) {
                Integer n = numbers.get(houwManyHoursYouWantToAdd);
                yourHoursInYourTimeZone = date.getHours();
                yourMinutesInYourTimeZone = date.getMinutes();
                yourSecondsInYourTimeZone = date.getSeconds();


                if (n != null) {
                    if (yourHoursInYourTimeZone + n > 24) {
                        System.out.println( yourHoursInYourTimeZone + n + (-24) + " hour(s)" + " " + yourMinutesInYourTimeZone + " minute(s)" + " " + yourSecondsInYourTimeZone + (" second(s)"));
                    }else if (yourHoursInYourTimeZone <= 24){
                        System.out.println(yourHoursInYourTimeZone + n + " hour(s)" + " " + yourMinutesInYourTimeZone + " minute(s)" + " " + yourSecondsInYourTimeZone + (" second(s)"));
                    }
                }
                break;
            }
            System.out.println("Invalid input! Enter value again.:");
        }
    }
}
