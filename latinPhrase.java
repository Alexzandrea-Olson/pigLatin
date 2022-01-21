
public class latinPhrase {
	
	//variables
	private String[] tokens;
	private String newSentence;
	
	//empty constructor 
	public latinPhrase(){
		
	}

	//Spiting the sentence after every space
	public String split(String sentence) {
		
		//saving sentence as a local variable and as a token
		tokens = sentence.split(" ");
		newSentence = sentence;
		
		printSentence(newSentence); //calling print method to print string
		printLatinTokenWords(tokens); //calling print method to print a token
		
		
		return sentence;
		
	}

	//printing a token value
	private void printLatinTokenWords(String[] tokens2) {
		System.out.println();
		System.out.println("The Pig Latin Sentence is: " );
		//changing word to pigLatin format
		for(String token : tokens2) {
			String temp = token.substring(1);
			temp = temp + token.charAt(0) + "ay";
			
			
			System.out.print(temp + " ");
		}
		
	}

	//printing a string value
	public static void printSentence(String newSentence) {
	
		System.out.println();
		System.out.println("The Original Sentence: " );
		System.out.println(newSentence);
	}
	


	
	
}
