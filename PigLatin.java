/*
 * Author: Michael Barcelo
 * Filename: PigLatin.java
 * Github: MBarc
 */
package piglatin;

import static java.lang.Math.random;

import java.util.Scanner;
import java.util.Random;

public class PigLatin
{
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        Random r = new Random();
        
        //Getting the user's input
        System.out.println("Please enter a word to translate to Pig Latin: ");
        String userInput = in.nextLine();
        
        //Declaring the endings
        String[] endings = {"way", "yay", "ay"};
              
        //If the word starts with a vowel
        if(userInput.startsWith("a") || userInput.startsWith("e") || userInput.startsWith("i") || userInput.startsWith("o") || userInput.startsWith("u"))
        {   
            //Picking choice from 'endings' at random
            int index = r.nextInt(endings.length);
            
            //Printing out the new Pig Latin word
            System.out.println(userInput + endings[index]);
            
            
        } else if(userInput.startsWith("ch") || userInput.startsWith("sh") || userInput.startsWith("th")){
            
            //Grabs first two letters of userInput
            String firstTwo = userInput.substring(0,2);
            
            //Removing the first two letters of userInput
            String removedTwo = userInput.substring(2);
            
            //Picking choice from 'endings' at random
            int index = r.nextInt(endings.length);
            
            //Printing out the new Pig Latin word
            System.out.println(removedTwo + firstTwo + endings[index]);
          
        } else {
            //Grabs first two letters of userInput
            String firstTwo = userInput.substring(0,2);
            
            //Removing the first two letters of userInput
            String removedTwo = userInput.substring(2);
            
            //Picking choice from 'endings' at random
            int index = r.nextInt(endings.length);
            
            //Printing out the new Pig Latin word
            System.out.println(removedTwo + firstTwo + endings[index]);
        }    
    }
}
    



