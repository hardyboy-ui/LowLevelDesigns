package classes;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
	Cell[][] cells;
	int size;
	Board(int size,int snakes,int ladders)
	{
		this.size=size;
		setupBoard();
		setSnakes(snakes);
		setLadders(ladders);
	}
	private void setupBoard()
	{
		cells=new Cell[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				cells[i][j]=new Cell();
			}
		}
	}
	private void setSnakes(int snakes)
	{
		while(snakes!=0)
		{
			int maxi=size*size;
			int snakeHead=ThreadLocalRandom.current().nextInt(0,maxi);
			int snakeTail=ThreadLocalRandom.current().nextInt(0,maxi);
			if(snakeHead>snakeTail && findCell(snakeHead).jump==null)
			{
				findCell(snakeHead).jump=new Jump(snakeHead,snakeTail);
				snakes--;
			}
		}
	}
	private void setLadders(int ladders)
	{
		while(ladders!=0)
		{
			int maxi=size*size;
			int ladderStart=ThreadLocalRandom.current().nextInt(0,maxi);
			int ladderEnd=ThreadLocalRandom.current().nextInt(0,maxi);
			if(ladderStart<ladderEnd && findCell(ladderStart).jump==null)
			{
				findCell(ladderStart).jump=new Jump(ladderStart,ladderEnd);
				ladders--;
			}
		}
	}
	public Cell findCell(int number)
	{
		return cells[number/size][number%size];
	}
}
