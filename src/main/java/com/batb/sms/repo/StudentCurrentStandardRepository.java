package com.batb.sms.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.batb.sms.bean.Student;
import com.batb.sms.bean.StudentCurrentStandard;

public interface StudentCurrentStandardRepository extends JpaRepository<StudentCurrentStandard, String> {
    public final static String FIND_STUDENT_BY_CLASS_AND_ROLL = "SELECT s FROM StudentCurrentStandard scs WHERE scs.class_=:class_ AND scs.rollNo = :rollNo";

    StudentCurrentStandard getByStudent(Student student);

    List<StudentCurrentStandard> getByYear(BigDecimal year);

    List<StudentCurrentStandard> getByClass(BigDecimal class_);

    @Query("SELECT scs from StudentCurrentStandard scs WHERE scs.class=:class AND scs.year=:year")
    List<StudentCurrentStandard> getByClassYear(@Param("class") BigDecimal class_, @Param("year") BigDecimal year);

    @Query(FIND_STUDENT_BY_CLASS_AND_ROLL)
    Student getStudentByClassAndRoll(@Param("class_") BigDecimal class_, @Param("rollNo") BigDecimal rollNo);
}
