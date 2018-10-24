/**
 * 
 * @author jeremy
 * Period 6
 * AP Comp Sci
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
		int rollCount = 0; // counts roll to roll point, so initial roll isn't counted
		int point;
		boolean playAgain = true;
		
		while(playAgain)
		{
			// start the game
			System.out.println("Welcome to Craps!");
			System.out.print("Press enter to roll\n");
			in.nextLine();
			
			int roll1 = die1.roll(); // each roll is passed separately because each die is displayed
			int roll2 = die2.roll();
			int roll = roll1 + roll2;
			
			displayRoll(roll1, roll2);
			
			// win
			if(roll == 7 || roll == 11)
			{
				System.out.println("You rolled a 7 or 11, you win!\n");
			}
			
			// lose
			else if(roll == 2 || roll == 12)
			{
				System.out.println("You rolled a 2 or 12, you lose!\n");
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
					
					roll1 = die1.roll();
					roll2 = die2.roll();
					roll = roll1 + roll2;
					
					displayRoll(roll1, roll2);
					rollCount++;
				}
				
				System.out.printf("You rolled your point after %d rolls, you win!\n", rollCount);
			}
			
			System.out.print("Would you like to play again? (yes, no): ");
			String usrPlayAgain = in.nextLine();
			
			while(!usrPlayAgain.equals("yes") && !usrPlayAgain.equals("no"))
			{
				System.out.print("\nInvalid input, enter 'yes' or 'no': ");
				usrPlayAgain = in.nextLine();
			}
			
			if(usrPlayAgain.equals("yes"))
				playAgain = true;
			
			else if(usrPlayAgain.equals("no"))
				playAgain = false;
		}
	}
	
	public static void displayRoll(int roll1, int roll2)
	{
		
		
		if(roll1 == 1 || roll2 == 1)
		{
			System.out.println(" -----------");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println("|     *     |");
			System.out.println("|           |");
			System.out.println("|           |");
			System.out.println(" ----------");
		}
		
		if(roll1 == 2 || roll2 == 2)
		{
			System.out.println(" -----------");
			System.out.println("|           |");
			System.out.println("|  *        |");
			System.out.println("|           |");
			System.out.println("|        *  |");
			System.out.println("|           |");
			System.out.println(" ----------");
		}
		
		if(roll1 == 3 || roll2 == 3)
		{
			System.out.println(" -----------");
			System.out.println("|           |");
			System.out.println("|  *        |");
			System.out.println("|     *     |");
			System.out.println("|        *  |");
			System.out.println("|           |");
			System.out.println(" ----------");
		}

		if(roll1 == 4 || roll2 == 4)
		{
			System.out.println(" -----------");
			System.out.println("|           |");
			System.out.println("|  *     *  |");
			System.out.println("|           |");
			System.out.println("|  *     *  |");
			System.out.println("|           |");
			System.out.println(" ----------");
		}
		
		if(roll1 == 5 || roll2 == 5)
		{
			System.out.println(" -----------");
			System.out.println("|           |");
			System.out.println("|  *     *  |");
			System.out.println("|     *     |");
			System.out.println("|  *     *  |");
			System.out.println("|           |");
			System.out.println(" ----------");
		}
		
		if(roll1 == 6 || roll2 == 6)
		{
			System.out.println(" -----------");
			System.out.println("|           |");
			System.out.println("|  *  *  *  |");
			System.out.println("|  *  *  *  |");
			System.out.println("|  *  *  *  |");
			System.out.println("|           |");
			System.out.println(" ----------");
		}
		
		System.out.printf("You rolled %d\n", roll1 + roll2);
	}

}
