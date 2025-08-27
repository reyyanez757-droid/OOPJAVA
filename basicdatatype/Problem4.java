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
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input weight in pounds:");
        double weight = sc.nextDouble();
        System.out.println("Input height in inches:");
        double height = sc.nextDouble();
        
        double weightInkg = weight * 0.45359237;
        double heightInMeters = height * 0.0254;
        double bmi = weightInkg / (heightInMeters * heightInMeters);
        
        System.out.println("Body Mass Index is: " + bmi);
        
       
        
    }
    
}
