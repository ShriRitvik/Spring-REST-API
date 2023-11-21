package com.SB.RestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SB.RestAPI.Entity.Main;
import com.SB.RestAPI.Service.MainService;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;

	@PostMapping("/save")
	public Main create(@RequestBody Main main) {
		return mainService.create(main);

	}
	
	@PostMapping("/saveAll")
	public List<Main> createAll(@RequestBody List<Main> main) {
		return mainService.createAll(main);
		
	}
	
	@GetMapping("/{uid}")
	public Main getByid(@PathVariable long uid) {
		return mainService.getById(uid);
		
	}
	
	@GetMapping("/getAll")
	public List<Main> getAll(){
		return mainService.getAll();
		
	}
	
	@PutMapping("/{mid}")
	public Main update(@RequestBody Main main, @PathVariable("mid") long id) {
		return mainService.update(main, id);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable long id) {
		return mainService.delete(id);
		
	}

}
