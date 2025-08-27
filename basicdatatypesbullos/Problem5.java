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
public class Problem5 {
    public static void main(String[] args) {        
    
    Scanner scanner = new Scanner(System.in);

      
        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();

        
        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

     
        double metersPerSecond = distance / totalSeconds;
        double kilometersPerHour = (distance / 1000.0) / (totalSeconds / 3600.0);
        double milesPerHour = (distance / 1609.0) / (totalSeconds / 3600.0);

       
        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kilometersPerHour);
        System.out.println("Your speed in miles/h is " + milesPerHour);
    }
 }

    
