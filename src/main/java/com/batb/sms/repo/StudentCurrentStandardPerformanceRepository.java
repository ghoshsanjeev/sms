package com.batb.sms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.batb.sms.bean.Student;
import com.batb.sms.bean.StudentCurrentStandardPerformance;

public interface StudentCurrentStandardPerformanceRepository
		extends JpaRepository<StudentCurrentStandardPerformance, Long> {
	List<StudentCurrentStandardPerformance> getByStudent(Student student);

	@Query("SELECT scsp from StudentCurrentStandardPerformance scsp where scsp.student=:student AND scsp.semester=:semester")
	List<StudentCurrentStandardPerformance> getByStudentSemester(@Param("student") Student student,
			@Param("semester") int semester);
}
