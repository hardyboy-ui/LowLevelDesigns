package classes;

public class MatchesObserverImpl1 implements MatchesObserver {

	public MatchesObservableImpl1 observable=null;
	public MatchesObserverImpl1(MatchesObservableImpl1 observable)
	{
		this.observable=observable;
	}
	@Override
	public void displayToUser() {
		try {
		observable.scoreBoard.displayScore();
		}
		catch (Exception e)
		{
			System.out.println("HI");
		}
	}

}
