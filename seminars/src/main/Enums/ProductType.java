package src.Enums;

import src.Interfaces.ISelectebleItem;

public enum ProductType implements ISelectebleItem {
	SODA(1, "Газировка"),
	COOKIE(2, "Печенье"),
	CHIPS(3, "Чипсы");

	private Integer key;
	private String title;

	ProductType(Integer key, String title) {
		this.key = key;
		this.title = title;
	}

	static public ProductType getEntityByKey(Integer key) {
		ProductType[] options = ProductType.values();
		for (int i = 0; i < options.length; i++) {
			if (options[i].getKey() == key) {
				return options[i];
			}
		}

		return options[0];
	}

	public Integer getKey() {
		return this.key;
	}

	public String getTitle() {
		return this.title;
	}

	public String getMenuItemString() {
		return String.valueOf(this.getKey()) + ") " + this.getTitle();
	}

}
