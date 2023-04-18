package src;

import src.Interfaces.ICreatable;

public class Cookie extends Product implements ICreatable<Cookie> {
	private Cookie(String name, double price) {
		super(name, price);
	}

	public Cookie create() {
		String name = this.inputName();
		Double price = inputPrice();
		return new Cookie(name, price);
	}
}
