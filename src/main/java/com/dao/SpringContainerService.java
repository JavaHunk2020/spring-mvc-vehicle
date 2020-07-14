package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author javahunk
 * code to create spring container
 *
 */
public class SpringContainerService {
	
	private static ApplicationContext context;
	
	static{
		//Creating spring container inside static block
		context=new ClassPathXmlApplicationContext("profile-dao.xml");
		
	}
	
	public static  ProfileDao getProfileDao(){
		ProfileDao profileDao=(ProfileDao)context.getBean("profileDaoImpl");
		return profileDao;
	}

}
