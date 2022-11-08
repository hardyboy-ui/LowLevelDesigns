package observable;
import observer.ObserverInterface;
public interface ObservableInterface {
	public void addObserver(ObserverInterface obj);
	
	public void removeObserver(ObserverInterface obj);
	
	public void notifyObservers();
	
	public void setData(int newStock);
	
	public int getStockData();
	
	public String getProductName();
}
