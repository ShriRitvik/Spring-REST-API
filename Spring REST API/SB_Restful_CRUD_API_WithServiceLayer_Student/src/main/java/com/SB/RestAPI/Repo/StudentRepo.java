package com.SB.RestAPI.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SB.RestAPI.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
