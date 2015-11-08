package com.batb.sms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.batb.sms.bean.Student;
import com.batb.sms.bean.StudentCurrentStandard;

public interface StudentCurrentStandardRepository extends JpaRepository<StudentCurrentStandard, Long> {
    public final static String FIND_STUDENT_BY_CLASS_AND_ROLL = "SELECT scs FROM StudentCurrentStandard scs WHERE scs.class_=:class_ AND scs.rollNo = :rollNo";

    StudentCurrentStandard getByStudent(Student student);

    List<StudentCurrentStandard> getByYear(int year);

    @Query("SELECT scs from StudentCurrentStandard scs WHERE scs.class_=:class_ AND scs.year=:year")
    List<StudentCurrentStandard> getByClassYear(@Param("class_") int class_, @Param("year") int year);

    @Query("SELECT scs from StudentCurrentStandard scs where scs.class_=:class_ ")
    List<StudentCurrentStandard> getByClass(@Param("class_") int class_);

    
    @Query(FIND_STUDENT_BY_CLASS_AND_ROLL)
    Student getStudentByClassAndRoll(@Param("class_") int class_, @Param("rollNo") int rollNo);
}
