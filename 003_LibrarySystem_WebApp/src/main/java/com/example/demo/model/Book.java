package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "books")
@NamedQuery(name = "Book.findAll", query = "SELECT p FROM Book p")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "BOOKS_BOOKID_GENERATOR", sequenceName = "BOOKS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOKS_BOOKID_GENERATOR")

	@Column(name = "id")
	private Integer id;

	@Column(name = "booktitle")
	private String booktiltle;

	@Column(name = "bookauthor")
	private String bookauthor;

	public Book() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBooktiltle() {
		return booktiltle;
	}

	public void setBooktiltle(String booktiltle) {
		this.booktiltle = booktiltle;
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
