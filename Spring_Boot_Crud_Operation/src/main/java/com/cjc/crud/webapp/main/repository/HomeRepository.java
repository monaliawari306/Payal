package com.cjc.crud.webapp.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.webapp.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>
{
    public void findAllByUsernameAndPassword(String us, String ps);
}
