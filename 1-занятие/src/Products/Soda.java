package src.Products;

import src.Product;
import src.Enums.Volume;
import src.Helpers.Input;
public class Soda extends Product {
	private Volume volume;

	private Soda(String name, double price, Volume volume) {
		super(name, price);
		this.volume = volume; 
	}

	public Volume getVolume() {
		return this.volume;
	}

	public static Soda create() {
		String name = Product.inputName();
		Double price = Product.inputPrice();
		Volume volume = Soda.inputVolume();
		return new Soda(name, price, volume);
	}

	private static Volume inputVolume() {
		Volume[] options = Volume.values();

		for (int i = 0; i < options.length; i++) {
			System.out.println(options[i].getMenuItemString());
		}

		return Volume.getEntityByKey(Input.INSTANCE.stream.nextInt());
	}
}
