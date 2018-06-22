package adice;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
public class bdice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you roll the dice");
		int numberOfRolls = sc.nextInt();
		while(numberOfRolls != 0) {
			System.out.println("Enter number of sides of the dice");
			int diceSides = sc.nextInt();
			RandomValue dice = new RandomValue();
			if(dice.checkValidDice(diceSides)) {
				int value = dice.rollOut(diceSides);
				System.out.println("random number =  " + value);
			}
			else
				System.out.println("invalid dice");
			numberOfRolls-- ;
	
		}
		
		

	}

}
