package designpattern.singleton;

public final class Currency {

	private double dollar = 3.74;
	private double euro = 4.22;
	private static final Currency instance = new Currency();
	
	private Currency() {
		
	}

	public double getDollar() {
		return dollar;
	}

	public double getEuro() {
		return euro;
	}

	public static Currency getInstance() {
		return instance;
	}
	
}
