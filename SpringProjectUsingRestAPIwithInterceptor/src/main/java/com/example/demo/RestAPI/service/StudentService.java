package com.example.demo.RestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.RestAPI.Entity.Student;
import com.example.demo.RestAPI.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
             private StudentRepository studentrepository;
	
	public List<Student> getAllStudents(){
		return studentrepository.findAll();
	}
	public Student getStudent(int id) {
		return studentrepository.findById(id).get();
	}
	public void setorupdate(Student student) {
		studentrepository.save(student);
		
	}
	public boolean deletebyid(int id) {
		studentrepository.deleteById(id);
		return false;
	}
}
