package src;

import java.util.Iterator;

public class ProductListIterator<T extends Product> implements Iterator<T> {
	Node<T> current;

	public ProductListIterator(ProductList<T> list) {
		current = list.getHead();
	}

	public boolean hasNext() {
		return current != null;
	}

	public T next() {
		T data = current.getData();
		current = current.getNext();
		return data;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
