package com.Dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Student;

public class Dao extends HibernateDaoSupport
{
	
   //insert
	public void insertStudent(Student s1)
	{
		getHibernateTemplate().save(s1);
	}
}
