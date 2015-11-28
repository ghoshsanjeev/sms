package com.batb.sms.services;

import java.util.List;

import com.batb.sms.bean.Student;
import com.batb.sms.dto.MarkSheetDTO;

public abstract class StudentService extends CRUDService<Student> {
	
	public abstract List<MarkSheetDTO> getByClass(int class_);

}
