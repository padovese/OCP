package designpattern;

import designpattern.singleton.Currency;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Currency.getInstance().getEuro());
	}
}
