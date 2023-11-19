package com.SB.RestAPI.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SB.RestAPI.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
