package com.cjc.crud.webapp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.webapp.main.model.Student;
import com.cjc.crud.webapp.main.repository.HomeRepository;
import com.cjc.crud.webapp.main.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public void savedata(Student s)
	{
       hr.save(s);
		
	}

	@Override
	public void logincheck(String username, String password)
	{
		hr.findAllByUsernameAndPassword(username, password);
	}

	@Override
	public Iterable displayAllData() 
	{
		return hr.findAll();
	}

}
