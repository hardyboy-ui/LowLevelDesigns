package classes;

public class ATMCard {
	private int pin;
	private final String AccNo;
	private long balance;
	
	public ATMCard(int pin,String AccNo,int balance)
	{
		this.pin=pin;
		this.AccNo=AccNo;
		this.balance=balance;
	}
	
	public int getPin()
	{
		return this.pin;
	}
	
	public void setPin(int newPin)
	{
		this.pin=newPin;
	}
	
	public String getAccNo()
	{
		return this.AccNo;
	}
	
	public long getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(long newBalance)
	{
		this.balance=newBalance;
	}
	public void updateBalance(int newBalance)
	{
		this.balance=newBalance;
	}
}
