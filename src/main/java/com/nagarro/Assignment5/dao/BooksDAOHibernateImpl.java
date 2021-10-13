package com.nagarro.Assignment5.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.nagarro.Assignment5.entity.Books;

@Repository
public class BooksDAOHibernateImpl implements BooksDAO {
	private EntityManager entityManager;
	
	@Autowired
	public BooksDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager= theEntityManager;
	}

   
   
	public List<Books> findAll() {
		
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Books> theQuery=currentSession.createQuery("from Books",Books.class);
		List<Books> bs=theQuery.getResultList();
		return bs;
	}

    public Books findByBookCode(int theBookCode) {
		Session currentSession=entityManager.unwrap(Session.class);
		Books theBook=currentSession.get(Books.class, theBookCode);
		return theBook;
	}


	public void save(Books theBooks) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theBooks);	
	}


	public void deleteByBookCode(int theBookCode) {
		Session currentSession=entityManager.unwrap(Session.class);
		org.hibernate.Query theQuery=currentSession.createQuery("delete from Books where id=:bookCode");
		theQuery.setParameter("bookCode", theBookCode);
		theQuery.executeUpdate();
	}




}
