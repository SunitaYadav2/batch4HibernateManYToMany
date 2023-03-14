package com;
import javax.persistence.*;
import java.util.*;
@Entity
public class Book {
	
  private  int Book_id;
  private String bookName;
  private Set<Author> authors; // by using set we can add only unique  
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book( String bookName, Set<Author> authors) {
	super();
	
	this.bookName = bookName;
	this.authors = authors;
}

@Id
@Column (name="book_id")
@GeneratedValue(strategy=GenerationType.AUTO)
public int getBook_id() {
	return Book_id;
}
public void setBook_id(int book_id) {
	Book_id = book_id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))
public Set<Author> getAuthors() {
	return authors;
}
public void setAuthors(Set<Author> authors) {
	this.authors = authors;
}
@Override
public String toString() {
	return "Book [Book_id=" + Book_id + ", bookName=" + bookName + ", authors=" + authors + "]";
}

	
	

}
