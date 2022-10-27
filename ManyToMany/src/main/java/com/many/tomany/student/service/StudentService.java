package com.many.tomany.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.many.tomany.student.model.Student;
import com.many.tomany.student.repository.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository repository;
	
	public List<Student> listAllTheStudentsDetails(){
		return repository.findAll();
	}
	
	public Student postMapping(Student student) {
		return repository.save(student);
	}
	
	public List<Object> listall() {
		return repository.listAllTheValueUsingQuery();
	}
}
