package src.Enums;

import src.Interfaces.ISelectebleItem;

public enum UserMode implements ISelectebleItem {
	ALL(0, "Все"),
	CUSTOMER(1, "Покупатель"),
	ADMIN(2, "Администратор");

	private Integer key;
	private String title;

	UserMode(Integer key, String title) {
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
