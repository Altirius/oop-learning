package src.Enums;

import src.Interfaces.ISelectebleItem;

public enum Volume implements ISelectebleItem {
	L025(1, "250 мл"),
	L05(2, "500 мл"),
	L1(3, "1 л");

	private Integer key;
	private String title;

	Volume(Integer key, String title) {
		this.key = key;
		this.title = title;
	}

	static public Volume getEntityByKey(Integer key) {
		Volume[] options = Volume.values();
		for (int i = 1; i < options.length; i++) {
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
