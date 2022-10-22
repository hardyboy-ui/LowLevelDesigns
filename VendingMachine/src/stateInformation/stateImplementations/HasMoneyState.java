package stateInformation.stateImplementations;

import java.util.List;

import classes.Coin;
import classes.Item;
import classes.VendingMachine;
import stateInformation.State;

public class HasMoneyState implements State {

	public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		machine.setVendingMachineState(new SelectionState());
	}

	@Override
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Coin accepted");
		machine.getCoinList().add(coin);
	}

	@Override
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }


	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		System.out.println("Returned the full amount back in the Coin Dispense Tray");
		machine.setVendingMachineState(new IdleState());
		return machine.getCoinList();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("you can not update inventory in hasMoney  state");
	}

}
