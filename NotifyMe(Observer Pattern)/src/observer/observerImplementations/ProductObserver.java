package observer.observerImplementations;

import observer.ObserverInterface;
import observable.ObservableInterface;
//import observable.observableImplementations.*;
public class ProductObserver implements ObserverInterface {

	public ObservableInterface observable;
	public String name;
	public ProductObserver(ObservableInterface observable,String name)
	{
		this.observable=observable;
		this.name=name;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		int stock=observable.getStockData();
		String product=observable.getProductName();
		if(stock>0)
			System.out.println("Hey "+name+" stocks for your "+product+" are available now");
	}

}
