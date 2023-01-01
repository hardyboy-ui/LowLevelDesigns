package classes;
import java.util.*;
public class Launch {
	public static void main(String args[])
	{
		System.out.println("*************Welcome to Snake & Ladder*************");
		System.out.println();
		System.out.println("Taking you to setup the game");
		System.out.println("No. of Players");
		Scanner sc=new Scanner(System.in);
		int players=sc.nextInt();
		System.out.println("No. of Dices");
		int dices=sc.nextInt();
		System.out.println("No. of Snakes");
		int snakes=sc.nextInt();
		System.out.println("No. of Ladders");
		int ladders=sc.nextInt();
		System.out.println("No. of Rows&Cols in Board");
		int size=sc.nextInt();
		
		Game obj=new Game(snakes,ladders,dices,size,players);
//		Game obj=new Game(5,5,2,10,2);
		obj.play();
	}
}
