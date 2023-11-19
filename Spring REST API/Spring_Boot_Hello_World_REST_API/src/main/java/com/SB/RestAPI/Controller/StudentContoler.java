package com.SB.RestAPI.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SB.RestAPI.Enity.Student;

@RestController
public class StudentContoler {
	
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
		
	}
	
	//Whenver using Entity(STudent) object use keword "return new" 
	
	
	/* Build Spring Boot REST API returns Java Bean */
	
	//http://localhost:8080/student	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student(1,"Shrikanth","malligawad");
		
	}
	
	/* Build Spring Boot REST API returns List */
	//http://localhost:8080/students`		
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student(1,"shrikanth","Malligawad"));
		students.add(new Student(2,"shrikanth","Malligawad"));
		students.add(new Student(3,"shrikanth","Malligawad"));
		students.add(new Student(4,"shrikanth","Malligawad"));
		return students;
	}
	
	/*Spring Boot REST API with Path Variable*/
	
	@GetMapping("students/{id}/{fname}/{lname}")
	public Student StudentPathVariable(
			@PathVariable int id,
			@PathVariable String fname,
			@PathVariable String lname) {
		return new Student(id,fname,lname);
		
	}
	
	

}
