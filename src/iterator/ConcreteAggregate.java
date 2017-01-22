package iterator;

import java.util.ArrayList;

public class ConcreteAggregate<E> implements Aggregate<E> {
	private ArrayList<E> internalData;
	
	public ConcreteAggregate(){
		internalData = new ArrayList<E>();
	}
	
	@Override
	public Iterator<E> createIterator() {
		return new ConcreteIterator<E>(this);
	}
	
	public E get(int index){
		return internalData.get(index);
	}
	
	public void add(E element){
		internalData.add(element);
	}
	
	public int size(){
		return internalData.size();
	}
	
}
