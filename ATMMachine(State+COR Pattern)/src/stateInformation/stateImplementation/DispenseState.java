package stateInformation.stateImplementation;

import classes.*;
import stateInformation.State;

public class DispenseState implements State {

	String output;
	CashDenominations cash=null;
	<T> DispenseState(T obj)
	{
		if(obj instanceof String)
		{
			output=(String)obj;
		}
		else
		{
			cash=(CashDenominations)obj;
		}
	}
	@Override
	public void insertCard(ATM atmMachine, ATMCard card) throws Exception{
		System.out.println("Card Already inserted!!");

	}

	@Override
	public void insertPin(ATM atmMachine)throws Exception {
		System.out.println("Already have your pin");

	}

	@Override
	public void performOperation(ATM atmMachine)throws Exception {
		System.out.println("Operation already performed!!");

	}

	@Override
	public void collectInformation(ATM atmMachine)throws Exception {
		if(cash==null)
		{
			System.out.println(output);
		}
		else
		{
			printCash(cash);
		}
		State nextState=new IdleState();
		atmMachine.setCurrentState(nextState);
	}

	@Override
	public void cancelTransaction(ATM atmMachine)throws Exception {
		System.out.println("Transaction already completed");
	}
	
	public void printCash(CashDenominations cash)
	{
		System.out.println("Please take your cash");
		System.out.println("Rs 2000 :- "+cash.twoThousand+" Rs 500 :- "+cash.fiveHundred+" Rs 100 :- "+cash.oneHundred);
	}

}
