import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String continueYN;
		System.out.println("Welcome to the Dice Roller.");
		System.out.println("Please enter a number of sides.");

			int diceSides = input.nextInt();
		

		//do statment which holds the code to run the program and will restart when prompted
		do {
			System.out.println("Roll:");
			
			//calling the getRandom method to get random numbers based on the user input
			int rollOne = getRandom(diceSides);
			int rollTwo = getRandom(diceSides);
			System.out.println(rollOne);
			System.out.println(rollTwo);

			//this will just add some statements if certain numbers are rolled
			if (rollOne == 1 && rollTwo == 1) {
				System.out.println("Snake Eyes!");
			} else if (rollOne == 6 && rollTwo == 6) {
				System.out.println("Boxcars!");
			} else if (rollOne == 7 || rollTwo == 7) {
				System.out.println("Lucky number 7!");
			}

			System.out.println("Would you like to roll again? y/n");

			continueYN = input.next();

		} while (continueYN.equals("y"));

		System.out.println("Thank you for using Dice Roller!");

		input.close();

	}

	public static int getRandom(int diceFace) {

		int roll = (int) (Math.random() * diceFace + 1);

		return roll;

	}

}
