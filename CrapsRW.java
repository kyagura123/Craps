
/**
 * This program is a modification of Kaylin Yagura's initial
 * Craps.java implementation for her AP Computer Science A
 * course at Polytechnic School, January, 2022.
 *
 * @author Richard White (after Kaylin Yagura)
 * @version 2022-01-27
 */

import java.util.Scanner;

public class CrapsRW
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Let's Play Craps!");
        System.out.println("Do you need instructions(y/N)?");
        // Default input value is No
        String instructions = in.nextLine();
        if (instructions.equals(""))
        {
            // nothing
        }
        else if (instructions.toLowerCase().substring(0,1).equals("y"))
        {
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

        while(game_on)
        {
            System.out.println("Good Luck");
            System.out.println("Press <Enter> to roll the dice");
            String pause = in.nextLine();
            int num1 = d.roll();
            System.out.println("Your first roll is: " + num1);
            if (num1 == 7 || num1 == 11)
            {
                System.out.println("Congratulations! You win!");
            }

            else if (num1 == 2 || num1 == 3 || num1 == 12)
            {
                System.out.println("Sorry, you lose.");
            }
            else
            {
                boolean roll = true;
                System.out.println("That's your point.");
                System.out.println("Let's see if you can roll that number again before you roll a seven!");
                while (roll == true)
                {
                    System.out.println("Press <Enter> to roll the dice");
                    String pause1 = in.nextLine();
                    int num2 = d.roll();
                    if (num2 == 7)
                    {
                        roll = false;
                        System.out.println("Sorry, you lose.  You rolled a 7.");
                    }
                    else if (num2 == num1)
                    {
                        roll = false;
                        System.out.println("Congratulations! You rolled " + num2 +". You win!"); 
                    } 
                    else
                    {
                        System.out.println("You rolled a " + num2);
                        System.out.println("Keep rolling...");                
                    } 
                }
            }
            System.out.println("Play again? (Y/n)");
            // Default answer is Yes!
            String answer = in.nextLine();
            if (!(answer.equals("") || answer.toLowerCase().substring(0,1).equals("y")))
            {
                System.out.println("Thank you for playing!  Goodbye!");
                game_on = false;
            }
        }
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

This is a great version of the Craps game, Kaylin! You correctly implemented the 
rules of the game in your code, and the communication regarding how the game
was progressing as they kept rolling felt just right.

I also love that you took the single Die function and instead wrote a Dice function
that allows you to roll however many dice you want. That was smart!

Several things you can do to improve the project here:

1. Include your name and version/date in the JavaDocs at the beginning of the program!
   I had to check the git log to find out whose code this was. :)

2. You have four separate sections of your code where you ask the user if they
   want to play again. By reorganizing your code, you can just have a single section
   at the end of the game where you ask that one time. It makes your code easier
   to maintain, too, when you only have to fix one thing, as I'm about to suggest
   you do.

3. The handout suggested you implement a "default Yes/No" feature for questions
   where the user wants to play again, and shows you how to do that. That's a
   useful thing to include for future projects, so you should take a look at that
   and see how it works.

I'm going to finish this comment and commit the message, then do a follow-up commit
with a new version of your program so you can see how to implement items 2 and 3
there.

Otherwise, really nice work, Kaylin! We're going to have fun on our remaining 
projects this year!

SCORE: 47/50

*/

