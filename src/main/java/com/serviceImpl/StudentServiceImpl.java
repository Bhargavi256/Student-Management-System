package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.repository.StudentRepository;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepositry;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepositry.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepositry.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		
		return studentRepositry.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		
		return studentRepositry.save(student);
	}
	@Override
	public void deleteStudnetById(Long id) {
		// TODO Auto-generated method stub
		studentRepositry.deleteById(id);
	}

}
