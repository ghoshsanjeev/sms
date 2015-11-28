package com.batb.sms.repo;

import java.util.List;

import com.batb.sms.dto.MarkSheetDTO;

public interface StudentCurrentStandardCustomReposiroty {
	
	
	public List<MarkSheetDTO> getStudentDetails(int class_);

}
