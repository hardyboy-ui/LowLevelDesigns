package classes;

import stateInformation.*;

public class Launch {

	public static void main(String[] args) {
		System.out.println("**************WELCOME TO BANK ATM**************");
		CashDenominations initialCash=new CashDenominations(1000,2000,5000);
		ATM atmMachine=new ATM(initialCash);
		try {
			//operation 1
			State atmMachineState=atmMachine.getCurrentState();
			ATMCard card1=new ATMCard(2805,"11918525",50000);
			atmMachineState.insertCard(atmMachine, card1);
			
			atmMachineState=atmMachine.getCurrentState();
			ATMCard card2=new ATMCard(2503,"11917845",10000);
			atmMachineState.insertCard(atmMachine,card2);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.insertPin(atmMachine);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.performOperation(atmMachine);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.collectInformation(atmMachine);
			
			//operation 2
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.insertCard(atmMachine,card1);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.insertPin(atmMachine);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.performOperation(atmMachine);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.collectInformation(atmMachine);
			
			//operation 3
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.insertCard(atmMachine,card1);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.insertPin(atmMachine);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.performOperation(atmMachine);
			
			atmMachineState=atmMachine.getCurrentState();
			atmMachineState.collectInformation(atmMachine);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
