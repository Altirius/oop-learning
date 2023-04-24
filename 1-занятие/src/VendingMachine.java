package src;

import java.util.HashMap;

import src.Enums.ProductType;
import src.Enums.UserAction;
import src.Helpers.Input;
import src.Interfaces.IMachine;
import src.Products.Chips;
import src.Products.Cookie;
import src.Products.Soda;

public class VendingMachine implements IMachine {
	private HashMap<ProductType, ProductSet<? extends Product>> products = new HashMap<>();
	private UserAction action = UserAction.NOTHING;

	private ProductList<Soda> sodaList;

	public void start() {

		System.out.println("Start iteration testing");
		this.sodaList.add(Soda.create());
		this.sodaList.add(Soda.create());
		this.sodaList.add(Soda.create());

		for (Soda soda : this.sodaList) {
			System.out.println(soda);
		}

		System.out.println("End iteration testing");

		this.messageLoop();
	}

	private void messageLoop() {
		while (!isTimeToLeave()) {
			this.action = this.askAndGetUserAction();
			this.handleAction(action);
		}
	}

	private boolean isTimeToLeave() {
		return this.action == UserAction.EXIT;
	}

	private UserAction askAndGetUserAction() {
		this.askUserAction();
		return UserAction.getEntityByKey(Input.INSTANCE.stream.nextInt());
	}

	private void askUserAction() {
		UserAction[] options = UserAction.values();

		for (int i = 1; i < options.length; i++) {
			System.out.println(options[i].getMenuItemString());
		}
	}

	private void handleAction(UserAction action) {
		switch (action) {
			case ADD_PRODUCT:
				this.handleAddProduct();
			default:
				break;
		}
	}

	private void handleAddProduct() {
		ProductType type = inputProductType();
		ProductSet<? extends Product> product = inputProduct(type);
		this.products.put(type, product);
	}

	private ProductType inputProductType() {
		ProductType[] options = ProductType.values();

		for (int i = 0; i < options.length; i++) {
			System.out.println(options[i].getMenuItemString());
		}

		return ProductType.getEntityByKey(Input.INSTANCE.stream.nextInt());
	}

	private ProductSet<? extends Product> inputProduct(ProductType type) {
		switch(type) {
			case SODA:
				return new ProductSet<Soda>(Soda.create(), inputQty());
			case COOKIE:
				return new ProductSet<Cookie>(Cookie.create(), inputQty());
			case CHIPS:
				return new ProductSet<Chips>(Chips.create(), inputQty());
			default:
				return null;
		}
	}

	private Integer inputQty() {
		System.out.print("Введите количество: ");
		return Input.INSTANCE.stream.nextInt();
	}


}
