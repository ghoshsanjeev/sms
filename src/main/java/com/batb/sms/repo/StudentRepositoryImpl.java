package com.batb.sms.repo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentRepositoryImpl implements StudentRepositoryCustom {

	private Logger log = LoggerFactory.getLogger(StudentRepositoryImpl.class);

	@PersistenceContext(unitName = "entityManagerFactory")
	@Qualifier("entityManagerFactory")
	private EntityManager smsEntityManager;

	@Transactional(value = "transactionManager")
	public BigDecimal getGeneratedRollNo(int class_, char section) {
		BigDecimal rollNo = new BigDecimal(1);
		Session session = (Session) smsEntityManager.unwrap(Session.class);
		Query query = session.createSQLQuery("select fun_gen_roll_no(:v_section,:v_class) from dual");
		query.setParameter("v_class", class_);
		query.setParameter("v_section", section);
		List<?> result = query.list();
		if (result != null) {
			rollNo = (BigDecimal) result.get(0);
		} else {
			log.debug("result is null");
		}
		return rollNo;

	}

}
