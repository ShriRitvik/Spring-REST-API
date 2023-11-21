package com.SB.RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SB.RestAPI.Entity.Main;

@Repository
public interface MainRepo extends JpaRepository<Main, Long> {

}
