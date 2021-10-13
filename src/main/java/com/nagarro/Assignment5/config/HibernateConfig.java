package com.nagarro.Assignment5.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nagarro.Assignment5.entity.Books;
import com.nagarro.Assignment5.entity.User;

public class HibernateConfig {
	
	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Books.class).addAnnotatedClass(User.class).buildSessionFactory();
		return sessionFactory;
	}

}