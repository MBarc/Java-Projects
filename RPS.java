/**
 * Author: Michael Barcelo
 * filename: RPS.java
 * Github: MBarc
 */
package rps;

import java.util.Scanner;
import java.util.Random;

public class RPS 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        Random r = new Random();
       
        //declaring and initializing playAgain with a placeholder (because we change it later on)
        String lowerPlayAgain = "placeholder";
        
        do{
            System.out.print("Please choose between rock, paper, or scissors: ");
        
            //Grab user input and conver to lowercase
            String userInput = in.nextLine();
            String userChoice = userInput.toLowerCase();
        
            //Declaring choices for computer
            String[] computerOptions = {"rock", "paper", "scissors"};
        
            //Computer picks at random between the 3 options
            int computerIndex = r.nextInt(computerOptions.length);
            String computerChoice = computerOptions[computerIndex];
        
            //Stating what each player picked
            System.out.println("You chose: " + userChoice);
            System.out.println("I chose: " + computerChoice);
            
        
            //if the user picks "rock"
            if(userChoice.equals("rock"))
            {
                switch(computerChoice)
                {
                    case "scissors":
                        System.out.println("You win!");
                        System.out.print("Play again? Yes or no. ");
                        String playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    case "paper":
                        System.out.println("You lose!");
                        System.out.print("Play again? Yes or no. ");
                        playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    case "rock":
                        System.out.println("It's a tie!");
                        System.out.print("Play again? Yes or no. ");
                        playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    default:
                        System.out.println("Error with default statement.");
                }
            }
            
            //if the user picks "paper"
            else if (userChoice.equals("paper"))
            {
                switch(computerChoice)
                {
                    case "scissors":
                        System.out.println("You lose!");
                        System.out.print("Play again? Yes or no. ");
                        String playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    case "paper":
                        System.out.println("It's a tie!");
                        System.out.print("Play again? Yes or no. ");
                        playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    case "rock":
                        System.out.println("You win!");
                        System.out.print("Play again? Yes or no. ");
                        playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    default:
                        System.out.println("Error with default statement.");
                }
            }
            
            //if the user picks "scissors"
            else if (userChoice.equals("scissors"))
            {
                switch(computerChoice)
                {
                    case "scissors":
                        System.out.println("It's a tie!");
                        System.out.print("Play again? Yes or no. ");
                        String playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    case "paper":
                        System.out.println("You win!");
                        System.out.print("Play again? Yes or no. ");
                        playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    case "rock":
                        System.out.println("You lose!");
                        System.out.print("Play again? Yes or no. ");
                        playAgain = in.nextLine();
                        lowerPlayAgain = playAgain.toLowerCase();
                        break;
                    default:
                        System.out.println("Error with default statement.");
                }
            }
       
        }while(lowerPlayAgain.equals("yes"));
        
        if (lowerPlayAgain.equals("no"))
        {
            System.out.println("Exiting. . .");
        } 
        else {
                System.out.print("Did not understand. Exiting. . .");
                }
    }
    
}
