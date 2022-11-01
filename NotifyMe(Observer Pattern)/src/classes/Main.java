package classes;
import observable.observableImplementations.*;
import observer.observerImplementations.*;
public class Main {

	public static void main(String[] args) {
		
		IphoneObservable iPhones=new IphoneObservable("IPhone");
		
		ProductObserver observers[]=new ProductObserver[10];
		char ch='a';
		String s="";
		for(int i=0;i<10;i++)
		{
			observers[i]=new ProductObserver(iPhones,s+ch);
			ch++;
			iPhones.addObserver(observers[i]);
		}
		System.out.println("All the observers are added");
		System.out.println("Trying to decrease the stock");
		iPhones.setData(-10);
		System.out.println("Trying to increase the stock");
		iPhones.setData(100);
		System.out.println("Trying to decrease the stock");
		iPhones.setData(-111);
	}

}
