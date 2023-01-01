package classes;
import java.util.*;
public class ScoreBoard {
	int battingTurn=0;
	List<Team> teams=new ArrayList<Team>();
	public void addTeams()
	{
		Team team1=new Team("Chennai Super Kings");
		team1.scoreCard.put("DHONI", 0);
		team1.scoreCard.put("RAINA", 0);
		Team team2=new Team("Mumbai Indians");
		team2.scoreCard.put("ROHIT", 0);
		team2.scoreCard.put("BUMRAH", 0);
		teams.add(team1);
		teams.add(team2);
		
	}
	public void displayScore() 
	{
		
		for(Team t:teams)
		{
			t.displayScore();
		}
	}
	public void updateScoreBoard(String playerName,int run)
	{
		Team t=teams.get(battingTurn);
		t.updateScoreCard(playerName,run);
		if(t.ballsPlayed==4)
		{
			battingTurn=1;
			System.out.println("Batting changed!!");
		}
	}
}
