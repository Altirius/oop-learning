package src;

import java.util.ArrayList;
import src.Enums.Volume;

public class VendingMachine {
	private ArrayList<ProductSet<? extends Product>> products = new ArrayList<>();

	VendingMachine() {

	}

	public void addProduct() {
		this.products.add(new ProductSet<Soda>(new Soda("Cola", 100, Volume.L05), 30));
		// new ProductSet<Soda>(new Soda("Cola", 100, Volume.L05), 30);
	}


}
