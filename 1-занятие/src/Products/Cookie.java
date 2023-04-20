package src.Products;

import src.Product;

public class Cookie extends Product {
	private Cookie(String name, double price) {
		super(name, price);
	}

	static public Cookie create() {
		String name = Product.inputName();
		Double price = Product.inputPrice();
		return new Cookie(name, price);
	}
}
