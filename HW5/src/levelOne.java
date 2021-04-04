
public class levelOne extends question{
	public int LevelOne() {
		int x = Data.RNG();
		int y = Data.RNG();
		
		while ( x + y >= 10) {													//makes sure the sum is less than 10
			x = Data.RNG();
			y = Data.RNG();
		}
		
		
		System.out.println("What is " + x + " + " + y + " ?");
		
		int z = x + y;
		
		return twoTries(z);
		
		
	}
}
//tests only addition of numbers less than 10 whose sum is less than 10