/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.week3;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class LabWeek3 {
    
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner keyboard = new Scanner(System.in);    
        System.out.print("Please enter the first number: ");
         num1 = keyboard.nextInt();           
        System.out.print("Please enter the second number: ");
        num2 = keyboard.nextInt();
        System.out.print("Please enter the third number: ");
        num3 = keyboard.nextInt();        
        int largestNum = largestNumber(num1, num2, num3); 
        System.out.printf("The largest number out of %d, %d, and %d is %d%n", num1, num2, num3, largestNum);  
      
    }
    
     public static int largestNumber(int num1, int num2, int num3){
             if (num1 > num2 && num1 > num3){
                 return num1;
             }
             
             else if(num2 > num1 && num2 > num3){
                 return num2;
             }
             
             else if(num3 > num1 && num3 > num2){
                 return num3;
             }
             else{
                 return 0;
             }
         }
             
}