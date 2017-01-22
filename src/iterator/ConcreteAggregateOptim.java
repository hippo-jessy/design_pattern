package iterator;

import java.util.ArrayList;

public class ConcreteAggregateOptim<E> implements Aggregate<E> {

	private ArrayList<E> internalData;

	public ConcreteAggregateOptim() {
		this.internalData = new ArrayList<E>();
	}

	@Override
	public Iterator<E> createIterator() {
		return new Iterator<E>() {
			private int cursor = 0;

			@Override
			public E next() {
				return get(cursor++);
			}

			@Override
			public boolean hasNext() {
				return (cursor < size()) ? true : false;
			}

		};
	}

	public E get(int index) {
		return internalData.get(index);
	}

	public void add(E element) {
		internalData.add(element);
	}

	public int size() {
		return internalData.size();
	}

}
