package com;
import javax.persistence.*;
@Entity
public class Author {
	
	private int author_Id;
	private String author_name;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author( String author_name) {
		super();
		
		this.author_name = author_name;
	}
	
	
	@Id
	@Column(name="author_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getAuthor_Id() {
		return author_Id;
	}
	public void setAuthor_Id(int author_Id) {
		this.author_Id = author_Id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	@Override
	public String toString() {
		return "Author [author_Id=" + author_Id + ", author_name=" + author_name + "]";
	}
	
	
	
	
	
	
}

 


  
	
	
	
	

