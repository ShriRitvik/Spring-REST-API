package com.SB.RestAPI.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SB.RestAPI.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
