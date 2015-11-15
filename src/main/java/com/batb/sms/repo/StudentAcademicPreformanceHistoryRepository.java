package com.batb.sms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import com.batb.sms.bean.Student;
import com.batb.sms.bean.StudentAcademicPreformanceHistory;

public interface StudentAcademicPreformanceHistoryRepository extends JpaRepository<StudentAcademicPreformanceHistory, Long> {

    List<StudentAcademicPreformanceHistory> getByStudent(Student student);

    @Query("SELECT saph from StudentAcademicPreformanceHistory saph WHERE saph.semester=:semester AND saph.year=:year")
    List<StudentAcademicPreformanceHistory> getBySemesterYear(@Param("semester") int semester, @Param("year") int year);

    List<StudentAcademicPreformanceHistory> getByYear(int year);
}
