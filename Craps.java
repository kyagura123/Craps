
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Craps
{
    // instance variables - replace the example below with your own
    private int x;

    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Let's Play Craps!");
        System.out.println("Do you need instructions(Y/N)?");
        String instructions = in.nextLine();

        if(instructions.equals("Y") || instructions.equals("y") || instructions.equals("yes") || instructions.equals("Yes")){
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");

        }
        
        
        
        boolean game_on = true;
        
        while(game_on){
           System.out.println("Good Luck");
           System.out.println("Press <Enter> to roll the dice");
           String pause = in.nextLine();
           
           
            
        }

        
    }
}