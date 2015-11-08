package com.batb.sms.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batb.sms.bean.ClassSubjectRelation;

public interface ClassSubjectRelationRepository extends JpaRepository<ClassSubjectRelation, String> {
	
	ClassSubjectRelation getClassSubjectRelationById(String id);
	List<ClassSubjectRelation> getByClass(BigDecimal class_);
}
