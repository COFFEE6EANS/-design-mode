package com.zmj.design.iterator;

public class Book {
private String isbn;
private String name;
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", name=" + name + "]";
}
public Book(String isbn, String name) {
	super();
	this.isbn = isbn;
	this.name = name;
}

}
