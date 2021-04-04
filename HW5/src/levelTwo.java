
public class levelTwo extends question{
	public int LevelTwo() {
		int x = Data.RNG();
		int y = Data.RNG();
		System.out.println("What is " + x + " + " + y + " ?");
		
		int z = x + y;
		
		return twoTries(z);
		
		
	}
}
//tests addition of arbitrary one digit numbers (which means that the sum could be more than 10)