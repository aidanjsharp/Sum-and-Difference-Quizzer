
public class levelThree extends question{
	public int LevelThree() {
		int x = Data.RNG();
		int y = Data.RNG();
		
		while ( x - y < 0) {											//makes sure the difference is not negative
			x = Data.RNG();
			y = Data.RNG();
		}
		
		
		System.out.println("What is " + x + " - " + y + " ?");
		
		int z = x - y;
		
		return twoTries(z);
		
		
	}
}
//tests subtractions of one digit numbers with a non-negative difference