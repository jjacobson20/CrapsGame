/**
 * 
 * @author jeremy
 *
 */

import java.util.Scanner;

public class CrapsGame
{
	
	/*
	 * Rules:
	 * 		Roll die, 7 or 11 you win, 2 or 12 you lose
	 * 		Otherwise, the number is your point
	 * 		Roll until you reach your point
	 * 
	 * Logic:
	 * 		Press enter to roll dice each time
	 * 		Display point
	 * 		
	 */
	
	public static void main(String[] args)
	{
		// create dice and scanner
		DiceClass die1 = new DiceClass();
		DiceClass die2 = new DiceClass();
		Scanner in = new Scanner(System.in);
		
		// create roll variables and playAgain
		int roll = die1.roll() + die2.roll();
		int rollCount = 0;
		int point;
		boolean playAgain = true;
		
		while(playAgain)
		{
			// start the game
			System.out.println("Welcome to Craps!");
			System.out.print("Press enter to roll\n");
			in.nextLine();
			
			displayRoll(roll);
			
			// win
			if(roll == 7 || roll == 11)
			{
				System.out.println("You rolled a 7 or 11, you win!");
			}
			
			// lose
			else if(roll == 2 || roll == 12)
			{
				System.out.println("You rolled a 2 or 12, you lose!");
			}
			
			else
			{
				point = roll;
				roll = 0;
				rollCount++;
				System.out.println("Your roll is now your point");
				
				while(roll != point)
				{
					System.out.println("Press enter to roll again\n");
					in.nextLine();
					
					roll = die1.roll() + die2.roll();
					
					displayRoll(roll);
					rollCount++;
				}
				
				System.out.printf("You rolled your point after %d rolls, you win!", rollCount);
			}
			
			System.out.print("Would you like to play again? (yes, no): ");
			String usrPlayAgain = in.nextLine();
			
			if(usrPlayAgain.equals("yes"))
				playAgain = true;
			
			else if(usrPlayAgain.equals("no"))
				playAgain = false;
		}
	}
	
	// displays the roll in format "You rolled a(n) roll"
	public static void displayRoll(int roll)
	{
		System.out.printf("You rolled %d\n", roll);
	}

}
