package com.batb.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.batb.sms.bean.AttendanceCalendar;

public interface AttendanceCalendarRepository extends JpaRepository<AttendanceCalendar, Long> {

	AttendanceCalendar getAttendanceCalendarByClass_(int class_);
	
	@Query("SELECT a from AttendanceCalendar a where a.moth=:month and a.year=:year")
	AttendanceCalendar getByMonthYear(@Param("month")String month,@Param("year")int year);
}
