package verizon.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import verizon.learning.service.AdminService;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext objctx = new ClassPathXmlApplicationContext("context.xml");
		AdminService objService = (AdminService)objctx.getBean("adminService");
		System.out.println(objService.saveStudents(10, "prakash", "chennai", 12500.50));
		

	}

}
