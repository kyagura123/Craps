
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

        Dice d = new Dice(6, 2);

        boolean game_on = true;

        while(game_on){
            System.out.println("Good Luck");
            System.out.println("Press <Enter> to roll the dice");
            String pause = in.nextLine();
            int num1 = d.roll();
            System.out.println("Your first roll is: " + num1);

            if(num1 == 7 || num1 == 11){
                System.out.println("Congratulations! You win!");
                System.out.println("Play again? (Y/N)");
                String answer = in.nextLine();
                if(answer.equals("Y") || answer.equals("y") || answer.equals("yes") || answer.equals("Yes")){
                    game_on = true;
                }
                else{
                    System.out.println("Thank you for playing!  Goodbye!");
                    game_on = false;
                    break;
                    

                }

            }

            else if(num1 == 2 || num1 == 3 || num1 == 12){
                System.out.println("Sorry, you lose.");
                System.out.println("Play again? (Y/N)");
                String answer = in.nextLine();
                if(answer.equals("Y") || answer.equals("y") || answer.equals("yes") || instructions.equals("Yes")){
                    game_on = true;
                }
                else{
                    System.out.println("Thank you for playing!  Goodbye!");
                    game_on = false;
                    break;
                    

                }

            }

            else{
                boolean roll = true;
                System.out.println("That's your point.");
                System.out.println("Let's see if you can roll that number again before you roll a seven!");
                while(roll = true){
                    System.out.println("Press <Enter> to roll the dice");
                    String pause1 = in.nextLine();
                    int num2 = d.roll();

                    if(num2 == 7){
                        
                        
                        System.out.println("Sorry, you lose.  You rolled a 7.");
                        System.out.println("Play again? (Y/N)");
                        String answer = in.nextLine();
                        roll = false;
                        
                        
                        
                        if(answer.equals("Y") || answer.equals("y") || answer.equals("yes") || answer.equals("Yes")){
                            game_on = true;
                            roll = false;
                            break;
                        
                        
                        }
                        else{
                            System.out.println("Thank you for playing!  Goodbye!");
                            game_on = false;
                            break;
                            
                            

                        }
                    }

                    else if(num2 == num1){
                        roll = false;
                        System.out.println("Congratulations! You rolled " + num2 +". You win!");
                        System.out.println("Play again? (Y/N)");
                        String answer = in.nextLine();
                        if(answer.equals("Y") || answer.equals("y") || answer.equals("yes") || answer.equals("Yes")){
                            game_on = true;
                            roll = false;
                            break;
                        }
                        else{
                            System.out.println("Thank you for playing!  Goodbye!");
                            game_on = false;
                            break;

                        }
                    }
                    
                    else{
                        System.out.println("You rolled a " + num2);
                        System.out.println("Keep rolling...");
                        
                    }

                   
                }
            }

        }

    }
}