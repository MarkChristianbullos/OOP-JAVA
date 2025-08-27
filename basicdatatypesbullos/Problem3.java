/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypesbullos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
       
Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input the number of minutes: ");
        long minutes = input.nextLong();

        // Constants
        final int MINUTES_IN_DAY = 60 * 24;
        final int DAYS_IN_YEAR = 365;

        // Conversion
        long totalDays = minutes / MINUTES_IN_DAY;
        long years = totalDays / DAYS_IN_YEAR;
        long days = totalDays % DAYS_IN_YEAR;

        // Output
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}