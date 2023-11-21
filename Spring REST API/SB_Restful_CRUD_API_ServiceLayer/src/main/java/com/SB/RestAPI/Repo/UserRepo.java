package com.SB.RestAPI.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SB.RestAPI.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
