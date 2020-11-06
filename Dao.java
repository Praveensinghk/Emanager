package com.example.dao;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class Dao {
	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	public static SessionFactory getSessionFactory() {
		return sf;
	}

}
