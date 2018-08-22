package verizon.learning.service;
import verizon.learning.dao.*;
import verizon.learning.entity.*;

public class AdminService {
	
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
