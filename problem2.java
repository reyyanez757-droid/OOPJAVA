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
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Number");
        int number = sc.nextInt();
        
        if (number % 3 == 0) {
            System.out.println(number +" is divisible by 3");
        }else if (number % 3 != 0) {
            System.out.println(number + "is not divisible by 3");
        }
    }
}
