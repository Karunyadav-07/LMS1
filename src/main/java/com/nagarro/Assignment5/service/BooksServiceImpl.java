package com.nagarro.Assignment5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.Assignment5.dao.BooksDAO;
import com.nagarro.Assignment5.entity.Books;

@Service
public class BooksServiceImpl implements BooksService {
	private BooksDAO booksDAO;
	
	@Autowired
	public BooksServiceImpl(BooksDAO theBooksDAO) {
		booksDAO=theBooksDAO;
	}
	
    @Transactional
	public List<Books> findAll() {
		return booksDAO.findAll();
	}
    @Transactional
	public Books findByBookCode(int theBookCode) {
		return booksDAO.findByBookCode(theBookCode);
	}
    @Transactional
	public void save(Books theBooks) {
    	booksDAO.save(theBooks);

	}
    @Transactional
	public void deleteByBookCode(int theBookCode) {
    	booksDAO.deleteByBookCode(theBookCode);

	}

}
