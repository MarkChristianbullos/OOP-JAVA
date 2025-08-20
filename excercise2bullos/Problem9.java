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
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input Number Or Rows:");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"");
                
                
            }
            System.out.println();
        }
    }
    
}
