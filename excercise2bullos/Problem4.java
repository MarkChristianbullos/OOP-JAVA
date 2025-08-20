/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excercise2bullos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

       
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

       
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
    


