package com.flyingh.test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.flyingh.vo.User;

public class Demo {
	private ApplicationContext ctx;
	private HibernateTemplate hibernateTemplate;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		hibernateTemplate = ctx.getBean("hibernateTemplate",
				HibernateTemplate.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test5() {
		System.out.println(String.class.getSimpleName());
	}

	@Test
	public void test4() {
		hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session)
					throws HibernateException, SQLException {
				@SuppressWarnings("unchecked")
				List<User> list = session.createQuery("from User")
						.setFirstResult(1).setMaxResults(2).list();
				for (User user : list) {
					System.out.println(user.getUsername());
				}
				return list;
			}

		});
	}

	@Test
	public void test3() {
		@SuppressWarnings("unchecked")
		List<User> list = hibernateTemplate.getSessionFactory().openSession()
				.createQuery("from User").setFirstResult(1).setMaxResults(2)
				.list();
		for (User user : list) {
			System.out.println(user.getUsername());
		}
	}

	@Test
	public void test2() {
		@SuppressWarnings("unchecked")
		List<User> list = hibernateTemplate.find("from User");
		for (User user : list) {
			System.out.println(user.getUsername());
		}
	}

	@Test
	public void test() {
		User user = new User();
		user.setUsername("飞天");
		user.setPassword("abctest");
		user.setBirthday(new Date());
		hibernateTemplate.persist(user);
	}

}
