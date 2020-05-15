package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter age :");
        // Numerical input
        int age = myObj.nextInt();
        System.out.println("Enter hour of day:");
        int hourOfDay = myObj.nextInt();
        // Output input by user
        System.out.println("Age: " + age);
        System.out.println("Hour of day: " + hourOfDay);
        boolean num = shouldShopping(age, hourOfDay);
        System.out.println("Can go shopping");
        System.out.println(num);


        /*System.out.println(shouldShopping(24,1));
        System.out.println(shouldShopping(36,12));
        System.out.println(shouldShopping(69,10));
        System.out.println(shouldShopping(78,8));*/
    }

    public static boolean shouldShopping(int age, int hourOfDay) {
        if (hourOfDay < 6 || hourOfDay > 18) {
            return false;
        } else if ((age >= 65) && (hourOfDay >= 9 && hourOfDay <= 12)) {
            return true;
        } else if ((age < 65) && (hourOfDay < 9 || hourOfDay > 12)) {
            return true;
        }
        return false;
    }
}
