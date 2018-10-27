/*
 * Author: Michael Barcelo 
 * Filename: BinaryDemical.java
 * Github: MBarc
 */
package binarydecimal;

import java.util.Scanner;

public class BinaryDecimal 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        //Prompts the user to pick between options
        System.out.println("Please pick an option:");
        System.out.println("Decimal to Binary = 1");
        System.out.println("Binary to Decimal = 2");
        System.out.print("Answer: ");
        int userChoice1 = in.nextInt();
        
        
        if (userChoice1 == 1)
        {
            String userChoice;
            String userChoiceLower;
            do{
            //Prompts the user for input
            System.out.print("Please enter the number you would like to convert to Binary: ");
            int userInput = in.nextInt();
        
            //converts to Binary
            System.out.println(Integer.toBinaryString(userInput));
        
            //Prompts the user for input
            System.out.println("Would you like to convert another number? Yes or no.");
            in.nextLine(); //Eats the new line leftover by in.nextInt(), this is a weird scanner behavior. Ignore this line.
            userChoice = in.nextLine(); 
            userChoiceLower = userChoice.toLowerCase();
        
            }while(userChoiceLower.equals("yes"));
        
            //If user does not want to convert anymore numbers
            if(userChoiceLower.equals("no"))
            {
                System.out.println("Exiting. . .");
            }
            else
            {
                System.out.println("Did not understand. Exiting now. . .");
            }
        }
        else if (userChoice1 == 2)
        {
            String userChoice;
            String userChoiceLower;
            
            do{
        
            //Prompts the user for input
            System.out.print("Please enter the number you would like to convert to Decimal: ");
            int userInput = in.nextInt();
        
            String userInputString = Integer.toString(userInput);
            
            //converts to Binary
            int decimalValue = Integer.parseInt(userInputString, 2);
            
            System.out.println(decimalValue);
        
            //Prompts the user for input
            System.out.println("Would you like to convert another number? Yes or no.");
            in.nextLine(); //Eats the new line leftover by in.nextInt(), this is a weird scanner behavior. Ignore this line.
            userChoice = in.nextLine(); 
            userChoiceLower = userChoice.toLowerCase();
        
            }while(userChoiceLower.equals("yes"));
            
            //If user does not want to convert anymore numbers
            if(userChoiceLower.equals("no"))
            {
                System.out.println("Exiting. . .");
            }
            else
            {
                System.out.println("Did not understand. Exiting now. . .");
            }
    
        }
        else //Anything else given
        {
         System.out.println("Not an option. Exiting now. . .");   
        }
           
        
        
    }
    
    
}
