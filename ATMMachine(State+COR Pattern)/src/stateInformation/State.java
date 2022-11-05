package stateInformation;
import classes.ATMCard;
import classes.ATM;
public interface State {
	public void insertCard(ATM atmMachine,ATMCard card) throws Exception;
	public void insertPin(ATM atmMachine) throws Exception;
	public void performOperation(ATM atmMachine) throws Exception; // chooseOption ke andar perform operation rakhenge
	public void collectInformation(ATM atmMachine) throws Exception;
	public void cancelTransaction(ATM atmMachine) throws Exception;
}
