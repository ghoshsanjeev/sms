package com.batb.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batb.sms.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Long>, StudentRepositoryCustom {

	/*
	 * public final static String FIND_STUDENT_BY_CLASS_AND_ROLL =
	 * "SELECT s FROM Student s JOIN StudentCurrentStandard scs" +
	 * " ON s.id=scs.student WHERE scs.class_=:class_" +
	 * " AND scs.rollNo = :rollNo";
	 * 
	 * Student findById(String id);
	 * 
	 * @Query(FIND_STUDENT_BY_CLASS_AND_ROLL) Student
	 * findByClassAndRoll(@Param("class_") Integer class_, @Param("rollNo")
	 * Integer rollNo);
	 */
}
