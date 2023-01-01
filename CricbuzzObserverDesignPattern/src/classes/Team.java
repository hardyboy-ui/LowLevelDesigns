package classes;
import java.util.*;
public class Team {
	
	public Team(String TeamName)
	{
		this.TeamName=TeamName;
	}
	
	String TeamName;
	Map<String,Integer> scoreCard=new HashMap<String,Integer>();
	int ballsPlayed=0;
	public void displayScore()
	{
		int total=0;
		System.out.println("*************ScoreCard of "+TeamName+"*************");
		for(Map.Entry<String, Integer> m:scoreCard.entrySet())
		{
			total+=m.getValue();
			System.out.println(m.getKey()+" :-"+m.getValue());
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Total Score :-"+total);
		System.out.println("***************************************************");
	}
	public void updateScoreCard(String playerName,int runs)
	{
		int oldScore=scoreCard.get(playerName);
		int newScore=oldScore+runs;
		scoreCard.replace(playerName, newScore);
		ballsPlayed++;
	}
}
