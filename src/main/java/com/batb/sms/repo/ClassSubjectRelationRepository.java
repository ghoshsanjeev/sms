package com.batb.sms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batb.sms.bean.ClassSubjectRelation;

public interface ClassSubjectRelationRepository extends JpaRepository<ClassSubjectRelation, Long> {

	ClassSubjectRelation getClassSubjectRelationById(String id);

	List<ClassSubjectRelation> getByClass_(int class_);
}
