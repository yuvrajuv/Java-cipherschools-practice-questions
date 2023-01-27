import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
	//Objective: Generate Random Number
	//Package: java.util
	//Class: Random
	//Method: nextInt (limit) : generates random between 0 to limit
			
			try (Scanner sc = new Scanner(System.in)) {
				Random rnd = new Random();
				int computerChoice = rnd.nextInt (20);
				System.out.println("Computer Choice :" + computerChoice);
				
				// Guess the Number
				for(int i=1;i<=6; i++) {
				System.out.println("Guess a Number between 0 and 20 ");
				int userChoice = sc.nextInt ();
				if (userChoice>computerChoice) {
				System.out.println("Your Guess is Too High");
				}
				else if (userChoice< computerChoice) {
				System.out.println("Your Guess is 1 Low");
				}
				else {
				System.out.println("Gotcha! You Guessed it Right!!");
				break;
				}
				}
			}
	}
}