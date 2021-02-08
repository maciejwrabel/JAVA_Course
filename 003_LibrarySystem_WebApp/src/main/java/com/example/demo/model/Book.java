package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "books")
@NamedQuery(name = "Book.findAll", query = "SELECT c FROM Book c")
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "book_id")
	
	private Integer book_id;
	private String booktitle;
	private String bookauthor;
	
	
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
