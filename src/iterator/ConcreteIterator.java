package iterator;

public class ConcreteIterator<E> implements Iterator<E> {

	private ConcreteAggregate<E> aggregate;
	private int cursor = 0;

	public ConcreteIterator(ConcreteAggregate<E> aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public E next() {
		return aggregate.get(cursor++);
	}

	@Override
	public boolean hasNext() {
		return (cursor < aggregate.size()) ? true : false;
	}

}
