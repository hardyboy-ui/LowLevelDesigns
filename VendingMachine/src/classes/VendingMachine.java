package classes;

import java.util.ArrayList;
import java.util.List;
import stateInformation.State;

import stateInformation.stateImplementations.IdleState;
public class VendingMachine {
	private State vendingMachineState;
	private Inventory inventory;
	private List<Coin> coinList;
	
	VendingMachine()
	{
		vendingMachineState=new IdleState();
		inventory=new Inventory(10);
		coinList=new ArrayList<>();
	}
	public State getVendingMachineState()
	{
		return vendingMachineState;
	}
	
	public void setVendingMachineState(State vendingMachineState)
	{
		this.vendingMachineState=vendingMachineState;
	}
	
	public Inventory getInventory()
	{
		return inventory;
	}
	
	public void setInventory(Inventory inventory)
	{
		this.inventory=inventory;
	}
	
	public void setCoinList(List<Coin> coinList)
	{
		this.coinList=coinList;
	}
	
	public List<Coin> getCoinList()
	{
		return coinList;
	}
}
