package com.batb.sms.repo;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.batb.sms.bean.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
	/*
	public final static String 	FIND_STUDENT_BY_CLASS_AND_ROLL="SELECT s FROM Student s LEFT JOIN s.studentCurrentStandards scs"
			+ "WERE scs.class_=:class_"
			+ "AND scs.rollNo = :rollNo";*/
	
	Student findById(String id);
	
	/*@Query(FIND_STUDENT_BY_CLASS_AND_ROLL)
	Student findByClassAndRoll(@Param("class_") BigDecimal class_, @Param("rollNo") BigDecimal rollNo);*/

}
