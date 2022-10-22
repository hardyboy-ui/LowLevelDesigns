package classes;

public class Inventory {
	ItemShelf[] inventory=null;
	
	Inventory(int itemCount)
	{
		inventory=new ItemShelf[itemCount];
		initialEmptyInventory();
	}
	
	public ItemShelf[] getInventory()
	{
		return inventory;
	}
	public void setInventory(ItemShelf[] inventory)
	{
		this.inventory=inventory;
	}
	public void initialEmptyInventory()
	{
		int startCode=101;
		for(int i=0;i<inventory.length;i++)
		{
			ItemShelf shelf=new ItemShelf();
			shelf.setCode(startCode);
			shelf.setSoldOut(true);
			inventory[i]=shelf;
			startCode++;
		}
	}
	public void addItem(Item item,int codeNumber)throws Exception
	{
		for(ItemShelf itemShelf:inventory)
		{
			if(itemShelf.getCode()==codeNumber)
			{
				if(itemShelf.isSoldOut())
				{
					itemShelf.item=item;
					itemShelf.setSoldOut(false);
				}
				else
				{
					throw new Exception("Item already added");
				}
			}
		}
	}
	
	public Item getItem(int codeNumber)throws Exception
	{
		for(ItemShelf itemShelf:inventory)
		{
			if(itemShelf.getCode()==codeNumber)
			{
				if(itemShelf.isSoldOut())
					throw new Exception("Item is sold out !!");
				else
					return itemShelf.getItem();
			}
		}
		throw new Exception("Item Not Found !!");
	}
	
	public void updateSoldOutItem(int codeNumber)
	{
		for(ItemShelf itemShelf:inventory)
		{
			if(itemShelf.getCode()==codeNumber)
			{
				itemShelf.setSoldOut(true);
			}
		}
	}
}
