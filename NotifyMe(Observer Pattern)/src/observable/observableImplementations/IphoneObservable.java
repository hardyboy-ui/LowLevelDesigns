package observable.observableImplementations;

import observable.ObservableInterface;
import java.util.List;
import java.util.ArrayList;
import observer.ObserverInterface;

public class IphoneObservable implements ObservableInterface {

	List<ObserverInterface> observerList;
	String observableName;
	int stock;
	public IphoneObservable(String name)
	{
		observerList=new ArrayList<ObserverInterface>();
		this.observableName=name;
		this.stock=0;
	}
	@Override
	public void addObserver(ObserverInterface obj) {
		// TODO Auto-generated method stub
		observerList.add(obj);
	}

	@Override
	public void removeObserver(ObserverInterface obj) {
		// TODO Auto-generated method stub
		observerList.remove(obj);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(ObserverInterface observer:observerList)
		{
			observer.update();
		}
	}

	@Override
	public void setData(int newStock) {
		// TODO Auto-generated method stub
		stock+=newStock;
		if(stock<0)
			stock=0;
		notifyObservers();
	}

	@Override
	public int getStockData() {
		// TODO Auto-generated method stub
		return stock;
	}
	
	@Override
	public String getProductName()
	{
		return observableName;
	}
}
