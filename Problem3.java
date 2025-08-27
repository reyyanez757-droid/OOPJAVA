package basiccontrolstructurepart1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a 1st number: ");
          int firstnum = sc.nextInt();
          System.out.println("Input a 2nd number: ");
          int secondnum = sc.nextInt();
          System.out.println("Input a 3rd number: ");
          int thirdnum = sc.nextInt();
         
         int greatest = firstnum;
         if (secondnum > greatest) {
             greatest = secondnum;
             
         }
         if (thirdnum > greatest) {
             greatest = thirdnum;
             
         }
          System.out.println("The Greatest: "+ greatest);           
         }
        
    }
    



