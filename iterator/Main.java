package com.zmj.design.iterator;

import java.util.Iterator;

public class Main {
	/**迭代模式(接口回调，把Iterator<Book> 这当成是客户端提供给对方实现的接口)**/
	/**优点：**/
	/**1、实现功能分离，简化容器接口，让容器只实现本身的基本功能**/
	/**把迭代功能委让给外部类实现，符合类的设计原则**/
	/****/
	/****/
public static void main(String[] args) {
	MyArrayList mArray = new MyArrayList();
	Book b1 = new Book("123", "Java2");
	Book b2 = new Book("1232", "Java3");
	Book b3 = new Book("123333", "Java1");
	mArray.add(b1);
	mArray.add(b2);
	mArray.add(b3);
	Iterator<Book> iterator = mArray.getIterator();
	while(iterator.hasNext()){
		Book next = iterator.next();
		System.out.println(next);
	}
}
}
