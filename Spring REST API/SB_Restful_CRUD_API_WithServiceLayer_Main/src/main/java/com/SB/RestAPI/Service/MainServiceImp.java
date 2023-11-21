package com.SB.RestAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SB.RestAPI.Entity.Main;
import com.SB.RestAPI.Repository.MainRepo;

@Service
public class MainServiceImp implements MainService {

	@Autowired
	private MainRepo mainRepo;

	@Override
	public Main create(Main main) {
		// TODO Auto-generated method stub
		return mainRepo.save(main);
	}

	@Override
	public List<Main> createAll(List<Main> main) {
		// TODO Auto-generated method stub
		return mainRepo.saveAll(main);
	}

	@Override
	public Main getById(long id) {
		// TODO Auto-generated method stub
		return mainRepo.findById(id).get();
	}

	@Override
	public List<Main> getAll() {
		// TODO Auto-generated method stub
		return mainRepo.findAll();
	}

	@Override
	public Main update(Main main, long id) {
		// TODO Auto-generated method stub
		Main m = mainRepo.findById(id).get();
		m.setSku(main.getSku());
		m.setName(main.getName());
		m.setDescription(main.getDescription());
		m.setPrice(main.getPrice());
		m.setImageUrl(main.getImageUrl());
		m.setActive(main.isActive());
		return mainRepo.save(m);
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
	mainRepo.deleteById(id);
		return "Deleted Sucessfully";
	}
	

}
