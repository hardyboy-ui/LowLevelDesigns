package classes;

public interface MatchesObservable {
	public void updateScore(String playerName,int runs);
	public void notifyObservers();
}
