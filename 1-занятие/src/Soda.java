package src;

import src.Enums.Volume;
import src.Helpers.Input;
import src.Interfaces.ICreatable;

public class Soda extends Product implements ICreatable<Soda> {
	private Volume volume;

	Soda(String name, double price, Volume volume) {
		super(name, price);
		this.volume = volume; 
	}

	public Volume getVolume() {
		return this.volume;
	}

	public Soda create() {
		String name = inputName();
		Double price = inputPrice();
		Volume volume = inputVolume();
		return new Soda(name, price, volume);
	}

	private Volume inputVolume() {
		Volume[] options = Volume.values();

		for (int i = 1; i < options.length; i++) {
			System.out.println(options[i].getMenuItemString());
		}

		return Volume.getEntityByKey(Input.INSTANCE.stream.nextInt());
	}
}
