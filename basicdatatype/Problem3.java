/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatype;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number of minutes:");
         long minutes = sc.nextLong();
         
         int minutesInDay = 24 * 60;
         int minutesInYear = 365 * minutesInDay;
         
         long years = minutes / minutesInYear;
         long remainingMinutes = minutes % minutesInYear;
         long days = remainingMinutes / minutesInDay;
         System.out.println("Expected output:");
         
         System.out.println(minutes + " minutes is approximately" + years + "years and" + days + "days");
         
    }
    
}
