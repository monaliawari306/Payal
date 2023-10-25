package com.cjc.crud.webapp.main.servicei;

import com.cjc.crud.webapp.main.model.Student;

public interface StudentServiceI {

	public void savedata(Student s);

	public void logincheck(String username, String password);

	public Iterable displayAllData();

}
