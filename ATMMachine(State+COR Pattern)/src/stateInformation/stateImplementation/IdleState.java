package stateInformation.stateImplementation;

import classes.ATM;
import classes.ATMCard;
import stateInformation.State;

public class IdleState implements State {

	@Override
	public void insertCard(ATM atmMachine, ATMCard card) throws Exception{
		atmMachine.card=card;
		System.out.println("Card Successfully inserted");
		State nextState=new VerificationState();
		atmMachine.setCurrentState(nextState);
	}

	@Override
	public void insertPin(ATM atmMachine) throws Exception{
		System.out.println("Cant Enter PIN at this stage!!");
	}

	@Override
	public void performOperation(ATM atmMachine) throws Exception{
		System.out.println("Can't choose any operation at this stage!!");
	}

	@Override
	public void collectInformation(ATM atmMachine) throws Exception{
		System.out.println("No Information found");
	}

	@Override
	public void cancelTransaction(ATM atmMachine) throws Exception{
		System.out.println("Transaction Not Started");
	}

}
