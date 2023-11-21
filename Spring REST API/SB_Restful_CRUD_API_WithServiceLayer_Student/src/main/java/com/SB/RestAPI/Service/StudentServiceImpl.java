package com.SB.RestAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.SB.RestAPI.Entity.Student;
import com.SB.RestAPI.Repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student create(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> addAll(List<Student> student) {
		// TODO Auto-generated method stub
		return studentRepo.saveAll(student);
	}

	@Override
	public Student getById(long id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}
	
	@Override
	public List<Student> getAll(){
		return studentRepo.findAll();
	}

	@Override
	public Student update(Student student, long id) {
		// TODO Auto-generated method stub
		Student s=studentRepo.findById(id).get();
		s.setName(student.getName());
		s.setDescrption(student.getDescrption());
		s.setImageUrl(student.getImageUrl());
		s.setActive(student.isActive());
		s.setName(student.getName());
		return studentRepo.save(s);
		
	}

	@Override
	public String delete(long id) {

     studentRepo.deleteById(id);
	return "delete Sucessfully";
     
		
	}

	
	

}
