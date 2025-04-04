package com.example.demo.RestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RestAPI.Entity.Student;
import com.example.demo.RestAPI.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
     private StudentService studentservice;
	@GetMapping("/get")
	public List<Student> getStudents(){
		return studentservice.getAllStudents();
	}
	@GetMapping("/get/{id}")
	public Student getstudentById(@PathVariable int id) {
		return studentservice.getStudent(id);
	}
	@PostMapping("/post")
	public void save(@RequestBody Student student) {
		studentservice.setorupdate(student);
	}
	@PutMapping("/put")
	public void update(@RequestBody Student student) {
		studentservice.setorupdate(student);
	}
	@DeleteMapping("/Delete/{id}")
	public String delete(@PathVariable int id) {
	 boolean isdeleted=	studentservice.deletebyid(id);
		return isdeleted ?"not delete deleted":" deleted successfully";
	}
}
