package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestDAO dao = atx.getBean(TestDAO.class);
		
		TestBean user = new TestBean();
		user.setUserid("KimMinJeong");
		user.setUserpass("mirim");
		user.setUsername("±è¹ÎÁ¤");
		user.setUserage(20);
		
		dao.insert_userData(user);
		
		System.out.println("insert ¿Ï·á");
		
		atx.close();

	}

}
