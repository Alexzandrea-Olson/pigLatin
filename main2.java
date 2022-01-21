import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		//creating scanner
		Scanner input = new Scanner (System.in);
		
		//variables
		String sentence;
		String sentence2;
		
		//creating latinPhrase object
		latinPhrase phrase1 = new latinPhrase();
		
		//user input
		System.out.println("Enter sentence");
		sentence = input.nextLine();
		
		//using method in latinPhrase class
		sentence2 = phrase1.split(sentence); 
				
	}
}
