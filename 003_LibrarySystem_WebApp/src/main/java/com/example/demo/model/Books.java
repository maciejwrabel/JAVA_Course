package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "books")
@NamedQuery(name="Books.findAll", query="SELECT c FROM Books c")
public class Books implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="book_title")
	private String bookTile;
	
	@Column(name="book_author")
	private String bookAuthor;
	
	public Books() {
		
	}

	public String getBookTile() {
		return bookTile;
	}

	public void setBookTile(String bookTile) {
		this.bookTile = bookTile;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
