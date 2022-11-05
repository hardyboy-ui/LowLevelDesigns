package classes;
import stateInformation.State;
import stateInformation.stateImplementation.IdleState;

public class ATM {
	ATM(CashDenominations initialCash)
	{
		this.atmMachineState=new IdleState();
		this.cash=initialCash;
	}
	public ATMCard card;
	private CashDenominations cash;
	private State atmMachineState;
	
	public State getCurrentState()
	{
		return this.atmMachineState;
	}
	
	public void setCurrentState(State nextState)
	{
		this.atmMachineState=nextState;
	}
	
	public CashDenominations getCash()
	{
		return this.cash;
	}
	
	public void setCash(CashDenominations newCash)
	{
		cash=newCash;
	}
}
