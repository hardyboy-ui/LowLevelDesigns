package classes;

public class Main {

	public static void main(String[] args) {
		ScoreBoard scoreBoard=new ScoreBoard();
		scoreBoard.addTeams();
		MatchesObservableImpl1 match1=new MatchesObservableImpl1(scoreBoard);
		MatchesObserver user1=new MatchesObserverImpl1(match1);
		match1.observerList.add(user1);
		match1.updateScore("DHONI", 6);
		match1.updateScore("DHONI", 4);
		match1.updateScore("RAINA", 6);
		match1.updateScore("RAINA", 6);
		match1.updateScore("ROHIT", 6);
		match1.updateScore("ROHIT", 4);
		match1.updateScore("BUMRAH", 6);
		match1.updateScore("BUMRAH", 4);
	}

}
