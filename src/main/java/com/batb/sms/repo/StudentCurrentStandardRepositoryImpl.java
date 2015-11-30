package com.batb.sms.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.batb.sms.dto.MarkSheetDTO;

@Repository
public class StudentCurrentStandardRepositoryImpl implements StudentCurrentStandardCustomReposiroty {

	private Logger log = LoggerFactory.getLogger(StudentCurrentStandardRepositoryImpl.class);

	@PersistenceContext(unitName = "entityManagerFactory")
	@Qualifier("entityManagerFactory")
	private EntityManager smsEntityManager;

	@SuppressWarnings("unchecked")
	@Transactional(value = "transactionManager")
	public List<MarkSheetDTO> getStudentDetails(int class_) {
		Session session = (Session) smsEntityManager.unwrap(Session.class);
		Query query = session.createSQLQuery(
				"SELECT b.stdnt_name StudentName,a.roll_no rollNo FROM tbl_std_curr_std a,tbl_student b WHERE a.student=b.id and a.class=:class");
		query.setParameter("class", class_);
		List<MarkSheetDTO> resultList=query.setResultTransformer(new AliasToBeanResultTransformer(MarkSheetDTO.class)).list();
		return resultList;
	}

}
