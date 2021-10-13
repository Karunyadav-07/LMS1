package com.nagarro.Assignment5.service;

import java.util.List;

import com.nagarro.Assignment5.entity.Books;

public interface BooksService {
	public List<Books> findAll();
	public Books findByBookCode(int theBookCode);
	public void save(Books theBooks);
	public void deleteByBookCode(int theBookCode);
	

}
