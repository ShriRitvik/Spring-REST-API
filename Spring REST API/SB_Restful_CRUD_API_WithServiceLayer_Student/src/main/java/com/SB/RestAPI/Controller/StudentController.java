package com.SB.RestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SB.RestAPI.Entity.Student;
import com.SB.RestAPI.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Student create(@RequestBody Student student) {
		return studentService.create(student);

	}

	@PostMapping("/saveAll")
	public List<Student> createAll(@RequestBody List<Student> student) {
		return studentService.addAll(student);

	}

	@GetMapping("{id}")
	public Student getById(@PathVariable long id) {
		return studentService.getById(id);
	}

	@GetMapping("/all")
	public List<Student> getAll() {
		return studentService.getAll();
	}

	@PutMapping("/{id}")
	public Student update(@RequestBody Student student, @PathVariable("id") long uid) {

		return studentService.update(student, uid);

	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable long id) {
		return studentService.delete(id);
		
	}

}
