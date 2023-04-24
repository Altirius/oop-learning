package src.Enums;

import src.Interfaces.ISelectebleItem;

public enum UserAction implements ISelectebleItem {
	NOTHING(0, "", UserMode.ALL),
	ADD_PRODUCT(1, "Добавить товар", UserMode.ADMIN),
	EXIT(2, "Выйти", UserMode.ALL);

	private Integer key;
	private String title;
	private UserMode userMode;

	UserAction(Integer key, String title, UserMode userMode) {
		this.key = key;
		this.title = title;
		this.userMode = userMode;
	}

	static public UserAction getEntityByKey(Integer key) {
		UserAction[] options = UserAction.values();
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

	public UserMode getUserMode() {
		return this.userMode;
	}

	public String getMenuItemString() {
		return String.valueOf(this.getKey()) + ") " + this.getTitle();
	}
}
