package designpattern.singleton;

public class CurrencyWithLazyInstantiation {
	
	private double dollar = 3.74;
	private double euro = 4.22;
	private static CurrencyWithLazyInstantiation instance;
	
	private CurrencyWithLazyInstantiation() {
		
	}

	public double getDollar() {
		return dollar;
	}

	public double getEuro() {
		return euro;
	}

	//Lazy instantiation, only create the objects when the first user demands.
	//Synchronized makes the method thread safe.
	public synchronized static CurrencyWithLazyInstantiation getInstance() {
		if(instance == null) {
			instance = new CurrencyWithLazyInstantiation();
		}
		return instance;
	}
	
	
}
