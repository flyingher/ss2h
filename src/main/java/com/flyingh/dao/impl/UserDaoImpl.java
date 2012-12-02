package com.flyingh.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import com.flyingh.dao.UserDao;
import com.flyingh.vo.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	public void add(User user) {
		System.out.println("UserDaoImpl.add()");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
