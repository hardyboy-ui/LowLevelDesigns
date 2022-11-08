package classes;
import java.util.concurrent.ThreadLocalRandom;
public class Dice {
	public int diceCount;
	Dice(int diceCount)
	{
		this.diceCount=diceCount;
	}
	
	public int rollDice()
	{
		int sum=0;
		for(int dice=0;dice<diceCount;dice++)
		{
			int nextRandomNo=getRandomNumber(1,6);
			sum+=nextRandomNo;
		}
		return sum;
	}
	private int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
