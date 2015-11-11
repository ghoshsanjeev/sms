package com.batb.sms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batb.sms.bean.Student;
import com.batb.sms.repo.StudentRepository;

@Service
public class StudentSeriviceImpl extends StudentService {

    @Autowired
    StudentRepository repo;

    public Student getById(String id) {
	// TODO Auto-generated method stub
	return repo.getById(id);
    }

}
