package com.zmj.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
	private ArrayList<Book> books;//这边为了简化，所以用了jdk已经实现的arralist的类(正常实现arraylist都是用数组来实现的)
	private int index;
	public MyArrayList() {
		books = new ArrayList<>();
	}
	public void add(Book book){
		books.add(book);
	}
	public void remove(Book book){
		int indexOf = books.indexOf(book);
		books.remove(indexOf);
	}
	public Iterator<Book> getIterator(){
		return new Int();
	}
	private class Int implements Iterator<Book>{
		@Override
		public boolean hasNext() {
			if(index >=books.size()) return false;
			return true;
		}

		@Override
		public Book next() {
			return books.get(index++);
		}

		@Override
		public void remove() {
			
		}
		
	}
	
}
