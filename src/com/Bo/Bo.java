package com.Bo;

import com.Dao.Dao;
import com.model.Student;

public class Bo 
{
	Dao dao;
	
	 public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	//insert
	  public void insertStudent(Student s1)
		{
			dao.insertStudent(s1);
		}
	
}
