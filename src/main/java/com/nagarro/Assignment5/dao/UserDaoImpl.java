package com.nagarro.Assignment5.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.nagarro.Assignment5.config.HibernateConfig;
import com.nagarro.Assignment5.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
private  static SessionFactory sessionfactory = HibernateConfig.getSessionFactory();
	
	public User login(User user)
	{
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		String userid = user.getUserId();
		String password = user.getPassword();
		
		List<User> users = session.createQuery("from User u where u.userId='" + userid + "' and u.password='" + password + "'").list();
		tx.commit();
		if (users.size() == 1) 
		{
			System.out.println("passed");
			return users.get(0);
		} else
		{
			System.out.println("Failed");
			return null;
		}
	}

	
	

}
