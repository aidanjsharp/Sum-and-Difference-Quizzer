import java.util.Scanner;


public class question {								//Creates the question
	data Data = new data();							//imports the RNG
	Scanner myObj = new Scanner(System.in);			//initializes the scanner
	
	
	
	public int twoTries(int z) {												//makes sure the user gets 2 tries per question
		String userInput = myObj.nextLine();
		if(Integer.parseInt(userInput) == z) {
			System.out.println("Correct!");
			return 0;
			
		}else {
			System.out.println("Not quite. Try again.");						//gives second chance if wrong answer
			
			userInput = myObj.nextLine();
			if(Integer.parseInt(userInput) == z) {
				System.out.println("Correct!");
				return 0;
			}
			System.out.println("Incorrect.");
			return 1;
		}
	}
}
