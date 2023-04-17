package src;

import java.util.ArrayList;

import src.Enums.Volume;

public class VendingMachine<T extends Product> {
	private ArrayList<T> products = new ArrayList<>();

	VendingMachine() {

	}

	public void addProduct() {
		new ProductSet<Soda>(new Soda("Cola", 100, Volume.L05), 30);
	}

	
}
