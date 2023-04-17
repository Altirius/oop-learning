package src;

public class ProductSet<T extends Product>  {
	private T product;
	private Integer qty = 0;

	ProductSet(T product, Integer qty) {
		this.product = product;
		this.qty = qty;
	}

	public T getProduct() {
		return this.product;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void increaseQty() {
		this.qty++;
	}

	public void decreaseQty() {
		this.qty--;
	}
}
