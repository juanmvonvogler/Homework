import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prompt the user with a welcome message 
		
		//initialize the code and total guesses 
		String code = "37823";
		int totalGuesses = 1;
		
		//take input from user
		Scanner keyboard = new Scanner(System.in);
		
		//prompt the user to guess 
		System.out.println("Enter your 5-digit guess");
		String guess = keyboard.next();
		
		//calculate  
		while(totalGuesses < 10)
		{int correct = 0,sum = 0;
		for(int i = 0; i < code.length(); i++)

		{if(code.charAt(i) == guess.charAt(i)){correct++;
		sum += Integer.parseInt(code.charAt(i) + "");
}			}
		//tell user they guessed right
		System.out.println(correct + " and " + sum);
		if(guess.equals(code)){System.out.println("You guessed right!");
		
		//limit the amount of guesses 
		totalGuesses = 10;
}		else{guess = keyboard.next();totalGuesses++;}}
}		//done
	}