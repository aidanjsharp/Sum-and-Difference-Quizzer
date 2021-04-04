//AIDAN SHARP
//JAVA APPLICATIONS HW5




public class demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		levelOne Question1 = new levelOne();											//pulls in the questions to the class
		levelTwo Question2 = new levelTwo();
		levelThree Question3 = new levelThree();
		
		int points = 0;																	//creates variables for points and answers
		int ans; int ans2; int ans3;
		
		
		System.out.println("LEVEL ONE.");												//begin level 1
		while (points < 5) {
			ans = Question1.LevelOne(); 												//creates new question
			if (ans == 1){ break;}														//exits the program if answered wrong 2x
			
			points ++;																	//awards point for correct answer
		}
		
		if (points == 5) {																//continues onto level 2
			System.out.println("\n\n\nLEVEL TWO.");
			
			while (points < 10) {
				ans2 = Question2.LevelTwo(); 
				if (ans2 == 1){ break;}
				
				points ++;
			}
						
			if (points == 10) {															//continues onto level 3
				System.out.println("\n\n\nLEVEL THREE.");			
				while (points < 15) {
					ans3 = Question3.LevelThree(); 
					if (ans3 == 1){ break;}
					
					points ++;
				}
				
							
				if (points == 15) {
					System.out.println("\n\n\nCongratulations, you passed every level!!!!!!"); //winner winner chicken dinner
					
				}
		
				
			}

		}
		
		
		
	}

}
