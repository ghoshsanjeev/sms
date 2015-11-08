package com.batb.sms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.batb.sms.bean.ClassSubjectRelation;

public interface ClassSubjectRelationRepository extends JpaRepository<ClassSubjectRelation, Long> {

	ClassSubjectRelation getClassSubjectRelationById(String id);

	@Query("SELECT cs FROM ClassSubjectRelation cs WHERE cs.class_=:class_")
	List<ClassSubjectRelation> getByClass(@Param("class_")int class_);
}
