package com.example.demo.RestAPI.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.RestAPI.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

	
	

}
