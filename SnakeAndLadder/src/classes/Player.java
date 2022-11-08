package classes;

public class Player {
	public int playerId;
	public static int pid=1;
	public int currPosition;
	Player()
	{
		currPosition=0;
		playerId=pid;
		pid++;
	}
}
