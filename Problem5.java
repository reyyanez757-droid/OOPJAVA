/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiccontrolstructurepart1;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input an alphabet: ");         
       String alphabet = sc.next();
       
      if (alphabet.length()!= 1)
        System.out.println("error: input must be single character");
      else {
         char letter = Character.toLowerCase(alphabet.charAt(0));
            if (letter >= 'a' && letter <= 'z') {
       if (letter == 'a' || letter == 'e'|| letter == 'e' || letter == 'o' || letter == 'u') {
           System.out.println(letter +"is a vowel");
            } else {
            System.out.println(letter +"is a consonant");
            }
            
            }
    }
       
       
       
       
    }
    
}
