package src;

import src.Enums.Volume;

public class Soda extends Product {
	private Volume volume = Volume.L05;

	Soda(String name, double price, Volume volume) {
		super(name, price);
		this.volume = volume; 
	}

	public Volume getVolume() {
		return this.volume;
	}
}
