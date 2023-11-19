package com.SB.RestAPI.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SB.RestAPI.Entity.Employee;
import com.SB.RestAPI.Repository.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;

			/* POST MAPPING */
	
	//Single data store

	@PostMapping("/addEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return employeeRepo.save(emp);
	}
	
	
	//Mutliple data store

	@PostMapping("/addEmployees")
	public List<Employee> saveEmployees(@RequestBody List<Employee> emp) {
		return employeeRepo.saveAll(emp);

	}

	/* GET MAPPING */

	// retrive all value using GetMapping

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();

	}

	// retrive Single data and parameters are same as entity

	@GetMapping("/{id}")
	public Optional<Employee> findEmployeeById(@PathVariable int id) {
		return employeeRepo.findById(id);

	}

	/*
	 * //pending
	 * 
	 * @GetMapping("/{Name}") public Employee findEmployeeByName(@PathVariable
	 * ("Name") String fname) { return employeeRepo.findByName(fname);
	 * 
	 * }
	 */



	@PutMapping("/update")
	public Employee getupdate(@RequestBody Employee empupdate) {
		employeeRepo.save(empupdate);
		return empupdate;
	}

	// Updete By ID

	@PutMapping("/{id}")
	public Employee empUpdate(@RequestBody Employee empupdate, @PathVariable int id) {

		// Employee e=employeeRepo.findById(id);
		Employee e = new Employee();
		e.setId(empupdate.getId());
		e.setFname(empupdate.getFname());
		e.setLname(empupdate.getLname());
		e.setEmail(empupdate.getEmail());

		return employeeRepo.save(e);

	}

	// @DeleteMapping("/{id}")//same name entitvariables
	public Employee getDeleteMul(@PathVariable("id") int id) {
		employeeRepo.deleteById(id);
		return null;

	}
	// OR

	@DeleteMapping("/{id}") // same name entitvariables
	public String getDelete(@PathVariable("id") int id) {

		Employee e1 = employeeRepo.findById(id).get();

		return "Deleted Succeefull";

	}

}
