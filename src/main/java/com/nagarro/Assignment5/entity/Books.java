package com.nagarro.Assignment5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name = "book_code")
	private int bookCode;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "author")
	private String author;

	public Books() {

	}

	public Books(int bookCode, String bookName, String author) {
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", bookCode=" + bookCode + ", bookName=" + bookName + ", author=" + author + "]";
	}

}
