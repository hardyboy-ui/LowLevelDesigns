package stateInformation.stateImplementation;

import classes.ATM;
import java.util.*;
import classes.ATMCard;
import stateInformation.State;

public class VerificationState implements State {

	@Override
	public void insertCard(ATM atmMachine, ATMCard card) throws Exception{
		System.out.println("Card already inserted!!");
	}

	@Override
	public void insertPin(ATM atmMachine) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please type your pin");
		int pin=sc.nextInt();
		if(atmMachine.card.getPin()!=pin)
		{
			throw new Exception("Wrong Pin typed!! Please remove your card and try later");
//			System.out.println();
//			State nextState=new IdleState();
//			atmMachine.setCurrentState(nextState);
		}
		else
		{
			System.out.println("Pin matched!!");
			System.out.println();
			System.out.println("Please select your desired option");
			System.out.println("1:- Cash Withdrawl");
			System.out.println("2:- Cash Deposit");
			System.out.println("3:- Check balance");
			System.out.println("4:- Change PIN");
			State nextState=new OperationState();
			atmMachine.setCurrentState(nextState);
		}
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
		throw new Exception("Transaction ended , please take your card");
//		System.out.println();
//		State nextState=new IdleState();
//		atmMachine.setCurrentState(nextState);
	}

}
