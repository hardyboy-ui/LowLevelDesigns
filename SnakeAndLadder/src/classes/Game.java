package classes;
import java.util.*;
public class Game {
	private Dice dice;
	private Board board;
	private int WINNING_POINT;
	private Queue<Player> q;
	private Player winner=null;
	Game(int snakes,int ladders,int dices,int boardSize,int playerCount)
	{
		dice=new Dice(dices);
		board=new Board(boardSize,snakes,ladders);
		q=new LinkedList<>();
		WINNING_POINT=board.size*board.size;
		createPlayers(playerCount);
	}
	public void play()
	{
		Player currPlayer;
		while(winner==null)
		{
			currPlayer=q.peek();
			q.remove();
			q.add(currPlayer);
			
			System.out.println("Player"+currPlayer.playerId+" Turn");
			System.out.println("Player"+currPlayer.playerId+" start="+currPlayer.currPosition);
			int diceVal=dice.rollDice();
			int nextPosition=currPlayer.currPosition+diceVal;
			if(nextPosition==WINNING_POINT)
			{
				winner=currPlayer;
				currPlayer.currPosition=nextPosition;
			}
			else if(nextPosition <= WINNING_POINT)
			{
				currPlayer.currPosition=nextPosition;
				Cell nextCell=board.findCell(nextPosition);
				if(nextCell.jump!=null)
				{
					currPlayer.currPosition=nextCell.jump.end;
				}
			}
			else
			{
				int diff=WINNING_POINT - currPlayer.currPosition;
				System.out.println("Bring value less than"+ diff +" to move");
			}
			System.out.println("Player"+currPlayer.playerId+" end="+currPlayer.currPosition);
		}
		
		System.out.println("***************Winner is Player-"+winner.playerId+"***************");
	}
	private void createPlayers(int playerCount)
	{
		while(playerCount!=0)
		{
			Player player=new Player();
			q.add(player);
			playerCount--;
		}
	}
	
	
}
