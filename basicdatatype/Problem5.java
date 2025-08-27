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
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input distance in meter: ");
        int distance = sc.nextInt();
        System.out.println("Input hour: ");
        int hour = sc.nextInt();
        System.out.println("Input minute: ");
        int minute = sc.nextInt();
        System.out.println("Input second: ");
        int second = sc.nextInt();
        
        //second in 1 minute is 60 and 1 hour is 60 minutes, 60 * 60 = 3600
        double totalsecond = (hour * 3600)+(minute * 60) + second;
        double meterpersecond = distance / totalsecond;
        double kilometersperhour = (distance / 1000.0)/(totalsecond/3600.0);
        double milesperhour = (distance/1609.0)/(totalsecond/3600.0);
        
        System.out.println("Your speed in meters/second is "+meterpersecond);
        System.out.println("Your speed in km/h is "+ kilometersperhour);
        System.out.println("Your speed in miles/h is "+milesperhour);
        sc.close();
       
    }
    
}
