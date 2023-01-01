package classes;
import java.util.*;
public class MatchesObservableImpl1 implements MatchesObservable {
	public ScoreBoard scoreBoard=null;
	public List<MatchesObserver> observerList=new ArrayList<MatchesObserver>();
	public MatchesObservableImpl1(ScoreBoard scoreBoard)
	{
		this.scoreBoard=scoreBoard;
	}
	
	@Override
	public void updateScore(String playerName, int runs) {
		scoreBoard.updateScoreBoard(playerName, runs);
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for(MatchesObserver observer:observerList)
		{
			observer.displayToUser();
		}
	}

}
