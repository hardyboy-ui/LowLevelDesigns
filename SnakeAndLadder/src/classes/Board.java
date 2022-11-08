package classes;

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
			int snakeHead=getRandomNumber(0,size*size-1);
			int snakeTail=getRandomNumber(0,size*size-1);
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
			int ladderStart=getRandomNumber(0,size*size-1);
			int ladderEnd=getRandomNumber(0,size*size-1);
			if(ladderStart<ladderEnd && findCell(ladderStart).jump==null)
			{
				findCell(ladderStart).jump=new Jump(ladderStart,ladderEnd);
				ladders--;
			}
		}
	}
	public Cell findCell(int number)
	{
		return cells[number/10][number%10];
	}
	private int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
