package project.code;
import java.util.Scanner;

public class UnicodeCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char letter;
		int sumFirstWord = 0;
		int sumSecondWord = 0;
		int diffSum;
		
		System.out.println("Please enter a word.");
		String firstWord = scan.nextLine();
		
		System.out.println("Please enter a second word.");
		String secondWord = scan.nextLine();
		

		for (int i = 0; i < firstWord.length(); i++){
			letter = firstWord.charAt(i);
			System.out.println(letter + ": " + (int)letter);
			sumFirstWord += (int)letter;
		}
			
		System.out.println("Sum of First Word Equals: " + sumFirstWord);
		
		
		for (int i = 0; i < secondWord.length(); i++){
			letter = secondWord.charAt(i);
			System.out.println(letter + ": " + (int)letter);
			sumSecondWord += (int)letter;
		}
			
		System.out.println("Sum of Second Word Equals: " + sumSecondWord);

		diffSum = Math.abs(sumFirstWord - sumSecondWord);
		System.out.println("Difference (as absolute value): " + diffSum);
		
		
		scan.close();
	}

}
