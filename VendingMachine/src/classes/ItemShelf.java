package classes;

public class ItemShelf {
	Item item;
	int code;
	boolean soldOut;
	
	public int getCode()
	{
		return code;
	}
	
	public void setCode(int code)
	{
		this.code=code;
	}
	
	public boolean isSoldOut()
	{
		return soldOut;
	}
	
	public void setSoldOut(boolean soldOut)
	{
		this.soldOut=soldOut;
	}
	
	public void setItem(Item item)
	{
		this.item=item;
	}
	
	public Item getItem()
	{
		return item;
	}
}
