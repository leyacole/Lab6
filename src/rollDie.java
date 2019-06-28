import java.util.Random;
import java.util.Scanner;

public class rollDie {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		int numSide = 0;
		char userChoice = 'y';
		int rollCount = 1;
		
		
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println(" ");
		
		do  {
			
			Scanner scnr = new Scanner(System.in);
			System.out.println("How many sides should each die have? ");
			numSide = scnr.nextInt();
			
			System.out.println("Roll " + rollCount);
			rollCount++;
			
			int rollOne = generateRandomDieRoll(numSide);
			int rollTwo = generateRandomDieRoll(numSide);
			
			System.out.println(rollOne);
			System.out.println(rollTwo);
			
			System.out.println("Roll again? (y/n)");
			userChoice = scnr.next().charAt(0);
			System.out.println();
		}
		while (userChoice == 'y');
		
		System.out.println("Bye");
			
	}
		
	public static int generateRandomDieRoll(int nsides) {
		    
				
			Random  r = new Random();
			
		
			int roll = r.nextInt(nsides) + 1;
			return roll;
	}
}

     
	
	
	
	


