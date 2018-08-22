package verizon.learning.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import verizon.learning.dao.*;
import verizon.learning.entity.*;

@Service("adminService")
public class AdminService {
	
	@Autowired
	StudentsDao	objdao;

	public StudentsDao getObjdao() {
		return objdao;
	}

	public void setObjdao(StudentsDao objdao) {
		this.objdao = objdao;
	}
	
	public String saveStudents(int id,String strName,String strPlace, double fees)
	{
		String response = objdao.save(new Students(id,strName,strPlace,fees));
		return response;
	}

}
