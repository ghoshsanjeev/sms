package com.batb.sms.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.batb.sms.bean.Student;


public interface StudentRepository extends JpaRepository<Student, Long>, StudentRepositoryCustom {

    public final static String FIND_STUDENT_BY_CLASS_AND_ROLL = "SELECT s FROM Student s LEFT JOIN s.studentCurrentStandard scs" + " WHERE scs.class_=:class_" + " AND scs.rollNo = :rollNo";

    Student getById(int id);

    @Query(FIND_STUDENT_BY_CLASS_AND_ROLL)
    Student findByClassAndRoll(@Param("class_") int class_, @Param("rollNo") int rollNo);

}
