package src.Interfaces;

import src.Product;

public interface ICreatable<T extends Product> {
	public T create();
}
