import java.util.Scanner;

public class Craps 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hi " + name + ", Welcome to Craps!");
		
		System.out.println("You roll the die.");
		boolean stillRolling = true;
		
		int dieRollOne = (int)(Math.random()*6)+1;
		int dieRollTwo = (int)(Math.random()*6)+1;
		int totalDiceOne = dieRollOne + dieRollTwo;
		
		if(totalDiceOne == 2 || totalDiceOne == 12)
		{
			System.out.println("You rolled a " + dieRollOne + " and a " + dieRollTwo + " for a total of " + totalDiceOne + " You lose, " + name);
			stillRolling = false;
		}
		
		else if(totalDiceOne == 7 || totalDiceOne == 11)
		{
			System.out.println("You rolled a " + dieRollOne + " and a " + dieRollTwo + " for a total of " + totalDiceOne + " You win, " + name);
			stillRolling = false;
		}
		else
		{
			System.out.println("You rolled a " + dieRollOne + " and a " + dieRollTwo + " Your point is " + totalDiceOne + ", " + name);
		}
		
		int point = totalDiceOne; 
		
		while(stillRolling)
		{
			int dieRollThree = (int)(Math.random()*6)+1;
			int dieRollFour = (int)(Math.random()*6)+1;
			int totalDiceTwo = dieRollThree + dieRollFour;
			System.out.println("You rolled a " + dieRollThree + " and a " + dieRollFour + " Your point is " + totalDiceTwo);
			
			if(totalDiceTwo == 7)
			{
				System.out.println("You lose, " + name + "!");
				stillRolling = false;
			}
			
			else if(totalDiceTwo == point)
			{
				System.out.println("You win, " + name + "!");
				stillRolling = false;
			}
			
		}
	}
}
