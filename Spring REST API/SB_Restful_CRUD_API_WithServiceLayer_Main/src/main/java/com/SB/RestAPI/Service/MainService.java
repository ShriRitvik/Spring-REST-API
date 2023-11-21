package com.SB.RestAPI.Service;

import java.util.List;

import com.SB.RestAPI.Entity.Main;

public interface MainService {
	
	Main  create(Main main);
	
	List<Main> createAll(List<Main> main);
	
	Main getById(long id);
	
	List<Main> getAll();
	
	Main update(Main main,long id);
	
	String delete(long id);

}
