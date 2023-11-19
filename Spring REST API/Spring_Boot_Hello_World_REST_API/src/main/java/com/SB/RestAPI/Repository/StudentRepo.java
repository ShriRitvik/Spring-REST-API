package com.SB.RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SB.RestAPI.Enity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
