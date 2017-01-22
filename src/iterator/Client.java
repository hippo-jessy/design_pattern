package iterator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args){
		ConcreteAggregate<String> aggregate = new ConcreteAggregate<String>();
		aggregate.add("This");
		aggregate.add("is");
		aggregate.add("a");
		aggregate.add("bright");
		aggregate.add("day");
		Iterator<String> iter = aggregate.createIterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"/");
		}
		
		System.out.println();
		System.out.println("***********************");
		
		ConcreteAggregateOptim<String> aggregateOptim = new ConcreteAggregateOptim<String>();
		aggregateOptim.add("This");
		aggregateOptim.add("is");
		aggregateOptim.add("a");
		aggregateOptim.add("bright");
		aggregateOptim.add("day");
		Iterator<String> iter1 = aggregateOptim.createIterator();
		while(iter1.hasNext()){
			System.out.print(iter1.next()+"/");
		}	
		
		ArrayList<String> sampleList = new ArrayList<String>();
		Collections.addAll(sampleList,"a","b","c","d");
		//sampleList.iterator()调用的是ArrayList的父类AbstractList中实现Iterable接口的方法
		java.util.Iterator<String> iter2 = sampleList.iterator();
		while(iter2.hasNext()){
		  System.out.println(iter2.next());
		}
	}
}
