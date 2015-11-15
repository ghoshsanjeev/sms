package com.batb.sms.repo;

import java.math.BigDecimal;

public interface StudentRepositoryCustom {

	public BigDecimal getGeneratedRollNo(int class_, char section);
}
