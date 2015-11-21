package com.batb.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batb.sms.bean.Student;
import com.batb.sms.repo.StudentRepository;

@Service
public class StudentSeriviceImpl extends StudentService {

	@Autowired
	StudentRepository repo;

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	public List<Student> getAll() {
		return repo.findAll();
	}



	public Student create(Student obj) {
		return repo.save(obj);
	}

	public Student update(Student obj) {
		return repo.saveAndFlush(obj);
	}

	public void remove(Student obj) {
		repo.delete(obj);
		;
	}

}
