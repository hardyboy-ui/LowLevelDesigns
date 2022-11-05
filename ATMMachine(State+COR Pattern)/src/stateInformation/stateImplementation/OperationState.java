package stateInformation.stateImplementation;

import classes.ATM;
import java.util.*;
import classes.*;
import stateInformation.State;

public class OperationState implements State {

	int MAX_AMOUNT=10000;
	@Override
	public void insertCard(ATM atmMachine, ATMCard card) throws Exception{
		System.out.println("Card Already inserted!!");
	}

	@Override
	public void insertPin(ATM atmMachine) throws Exception{
		System.out.println("Already have your PIN!!");

	}

	@Override
	public void performOperation(ATM atmMachine)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int operationChoice=sc.nextInt();
		switch(operationChoice)
		{
		case 1: cashWithdrawl(atmMachine);
			    break;
		case 2: cashDeposit(atmMachine);
				break;
		case 3: checkBalance(atmMachine);
				break;
		case 4: changePin(atmMachine);
				break;
		default:;
		}
	}

	@Override
	public void collectInformation(ATM atmMachine) throws Exception{
		System.out.println("No Information found");
	}
	@Override
	public void cancelTransaction(ATM atmMachine) throws Exception{
		throw new Exception("Transcation cancelled!!");
//		State nextState=new IdleState();
//		atmMachine.setCurrentState(nextState);
	}
	
	private void changePin(ATM atmMachine)
	{
		System.out.println("Please enter your new PIN!!");
		Scanner sc=new Scanner(System.in);
		int newPin=sc.nextInt();
		atmMachine.card.setPin(newPin);
		String output="PIN Successfully changed";
		State nextState=new DispenseState(output);
		atmMachine.setCurrentState(nextState);
	}
	
	private void checkBalance(ATM atmMachine)
	{
		String output="Your current balance is Rs. "+atmMachine.card.getBalance();
		State nextState=new DispenseState(output);
		atmMachine.setCurrentState(nextState);
	}
	
	private void cashDeposit(ATM atmMachine)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Rs 2000 Notes");
		int tT=sc.nextInt();
		System.out.println("Enter the count of Rs 500 Notes");
		int fH=sc.nextInt();
		System.out.println("Enter the count of Rs 100 Notes");
		int oH=sc.nextInt();
		
		CashDenominations cashDeposited=new CashDenominations(tT,fH,oH);
		CashDenominations atmCash=atmMachine.getCash();
		CashDenominations newCashState=cashDeposited.add(atmCash);
		atmMachine.setCash(newCashState);
		
		long balanceDeposited=2000*tT+500*fH+100*oH;
		long cardBalance=atmMachine.card.getBalance();
		atmMachine.card.setBalance(balanceDeposited+cardBalance);
		
		String output="Cash successfully deposited!";
		State nextState=new DispenseState(output);
		atmMachine.setCurrentState(nextState);
		
	}
	
	private void cashWithdrawl(ATM atmMachine)
	{
		System.out.println("Enter the amount of money to withdraw (two 0 at end)");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		int withdrawnAmount=amount;
		if(amount>MAX_AMOUNT)
		{
			String output="Withdrawl over 10k not allowed, try again!!";
			State nextState=new DispenseState(output);
			atmMachine.setCurrentState(nextState);
		}
		else
		{
			long currBalance=atmMachine.card.getBalance();
			if(currBalance<amount)
			{
				String output="Enough Balance Not Available In Your Card!!";
				State nextState=new DispenseState(output);
				atmMachine.setCurrentState(nextState);
			}
			else
			{
				CashDenominations currentAtmCash=atmMachine.getCash();
				int tT=0,fH=0,oH=0;
				tT=amount/(2000);
				if(tT<currentAtmCash.twoThousand)
				{
					amount=amount%2000;
				}
				else
				{
					amount=amount-2000*currentAtmCash.twoThousand;
					tT=currentAtmCash.twoThousand;
				}
				fH=amount/(500);
				if(fH<currentAtmCash.fiveHundred)
				{
					amount=amount%500;
				}
				else
				{
					amount=amount-500*currentAtmCash.fiveHundred;
					fH=currentAtmCash.fiveHundred;
				}
				oH=amount/(100);
				if(oH<currentAtmCash.oneHundred)
				{
					amount=amount%100;
				}
				else
				{
					amount=amount-100*currentAtmCash.oneHundred;
					oH=currentAtmCash.oneHundred;
				}
				if(amount!=0)
				{
					String output="Bank Doesn't have enough notes or wrong amount entered!!";
					State nextState=new DispenseState(output);
					atmMachine.setCurrentState(nextState);
				}
				else
				{
					CashDenominations cashWithdrawn=new CashDenominations(tT,fH,oH);
					CashDenominations updatedAtmCash=currentAtmCash.subtract(cashWithdrawn);
					atmMachine.setCash(updatedAtmCash);
					long newBalance=currBalance-withdrawnAmount;
					atmMachine.card.setBalance(newBalance);
					State nextState=new DispenseState(cashWithdrawn);
					atmMachine.setCurrentState(nextState);
				}
			}
		}
	}
}
