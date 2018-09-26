/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3rps;

/**
 *
 * @author michaelcruz
 */

import java.util.Scanner; //imports the scanner class to accept keyboard input

public class Week3RPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in); //this enables the program to accept keyboard input
    
    System.out.println("Welcome, Grab a friend, (or enemy) and you can play Rock, Paper, Scissors together!"); //output to user to welcome them to the game of rock, paper, scissors.
    
    int plusfive = 0, p1score = 0, p2score = 0; //declaring variables for each player's score and the variable that tells the program to stop looping
    
    while ((p1score <= p2score + 5) && (p2score <= p1score + 5)) //while loop that tells program to loop until one player has 5 more wins than the other
    {
        if (p1score >= p2score + 5) //if statement that outputs player 1 exceeded 5 wins over player 2
        {   
            
            System.out.println("Player 1 has acquired 5 more wins than Player 2");
            
            break;       
            
        }
            
        if (p2score >= p1score + 5) //if statement that outputs player 2 exceeded 5 wins over player 1
        { 
            
            System.out.println("Player 2 has acquired 5 more wins than Player 1");
            
            break;
            
        }
      
    System.out.println("Player 1 please choose (R) for Rock, (P) for Paper, or (S) for Scissors."); //output to screen to ask player 1 for their choice between R, P, and S
    
        String user1input = keyboard.next(); //declares and enables keyboard input for the variable user1input
    
            while (!(user1input.equalsIgnoreCase("R")) && (!(user1input.equalsIgnoreCase("P"))) && (!(user1input.equalsIgnoreCase("S")))) //loops player 1 input until valid letter is entered
            { 
                System.out.println("Please enter a valid letter (R, P, or S)."); //output to player 1 to ask for valid input after invalid letter has been entered
                
                user1input = keyboard.next(); // enables keyboard input for user1input variable               
            }
                
    System.out.println("Player 2 please choose (R) for Rock, (P) for Paper, or (S) for Scissors."); //output to screen to ask player 2 for their choice between R, P, and S
    
    String user2input = keyboard.next(); //declares and enables keyboard input for the variable user2input
    
            while (!(user2input.equalsIgnoreCase("R")) && (!(user2input.equalsIgnoreCase("P"))) && (!(user2input.equalsIgnoreCase("S")))) //loops player 2 input until valid letter is entered
            { 
                System.out.println("Please enter a valid letter (R, P, or S)."); //output to player 2 to ask for valid input after invalid letter has been entered
                
                user2input = keyboard.next(); //enables keyboard input for user2input variable                            
            }

    switch (user1input) //switch statement for user1input
    
    {
 
        case "R":
            
        case "r":
            
           switch (user2input) // nested switch statement for use if player 1 enters R, each case represents the 3 options that player 2 can enter
           {
               case "R":
                   
               case "r":
                   
                    System.out.println("It's a TIE!");
                    
                    System.out.println(("The current score is ") + p1score + (" - ") + p2score);
                    
                    break;
               
               case "P":
                   
               case "p":
                   
                   System.out.println("Player 2 WINS!");
                   
                   p2score++; //assignment statement that adds 1 point to player 2 score
                   
                   System.out.println(("The current score is ") + p1score + (" - ") + p2score);
                   
                   break;
                    
               case "S":
                   
               case "s":
                   
                   System.out.println("Player 1 WINS!");
                   
                   p1score++; //assignment statement that adds 1 point to player 1 score
                   
                   System.out.println(("The current score is ") + p1score + (" - ") + p2score);
           }
            break;
            
        case "P":
        
        case "p": 
            
            switch (user2input) // nested switch statement for use if player 1 enters P, each case represents the 3 options that player 2 can enter
           {
               case "R":
                   
               case "r":
                   
                    System.out.println("Player 1 WINS!");
                    
                    p1score++; //assignment statement that adds 1 point to player 1 score
                    
                    System.out.println(("The current score is ") + p1score + (" - ") + p2score);
                    
                    break;
               
               case "P":
                   
               case "p":
                   
                   System.out.println("It's a TIE!");
                   
                   System.out.println(("The current score is ") + p1score + (" - ") + p2score);
                   
                   break;
                    
               case "S":
                   
               case "s":
                   
                   System.out.println("Player 2 WINS!");
                   
                   p2score++; //assignment statement that adds 1 point to player 2 score
                   
                   System.out.println(("The current score is ") + p1score + (" - ") + p2score);
           }

        
            break;
            
        case "S":
            
        case "s": 
            
            switch (user2input) // nested switch statement for use if player 1 enters S, each case represents the 3 options that player 2 can enter
           {
               case "R":
                   
               case "r":
                   
                    System.out.println("Player 2 WINS!");
                    
                    p2score++; //assignment statement that adds 1 point to player 2 score
                    
                    System.out.println(("The current score is ") + p1score + (" - ") + p2score);
                    
                    break;
               
               case "P":
                   
               case "p":
                   
                   System.out.println("Player 1 WINS!");
                   
                   p1score++; //assignment statement that adds 1 point to player 1 score
                   
                   System.out.println(("The current score is ") + p1score + (" - ") + p2score);
                   
                   break;
                    
               case "S":
                   
               case "s":
                   
                   System.out.println("It's a TIE!");
                   
                   System.out.println(("The current score is ") + p1score + (" - ") + p2score);
                   
           }
       
            
    }
            
    }
    
    }
}
    

