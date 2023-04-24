package src.Products;

import src.Product;

public class Chips extends Product {
	private Chips(String name, double price) {
		super(name, price);
	}

	static public Chips create() {
		String name = Product.inputName();
		Double price = Product.inputPrice();
		return new Chips(name, price);
	}
}
