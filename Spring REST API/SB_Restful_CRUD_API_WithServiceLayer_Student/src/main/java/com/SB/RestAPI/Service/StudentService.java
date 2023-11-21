package com.SB.RestAPI.Service;

import java.util.List;

import com.SB.RestAPI.Entity.Student;

public interface StudentService {
	
	Student create(Student student);
	
	List<Student> addAll(List<Student> student);
	
	Student getById(long id);
	
	List<Student> getAll();
	
	Student update(Student student,long id);
	
	String delete(long id);

	

}
