package src;

import java.util.Iterator;

class CustomDataStructure<T> implements Iterable<T> {

	// code for data structure
	public Iterator<T> iterator() {
		return new CustomIterator<T>(this);
	}
}