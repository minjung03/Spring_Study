package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class mainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);


		// TestDAO 가져오기
		TestDAO dbo = atx.getBean(TestDAO.class);

		
		/*
		// TestBean 객체 bean1 만들어서 100, spring100 넣기
		TestBean bean1 = new TestBean();
		bean1.setData1(100);
		bean1.setData2("spring100");


		// TestBean 객체 bean2 만들어서 200, spring200 넣기
		TestBean bean2 = new TestBean();
		bean2.setData1(200);
		bean2.setData2("spring200");
		
		// TestBean 객체 bean2 만들어서 200, spring200 넣기
		TestBean bean3 = new TestBean();
		bean3.setData1(100);
		bean3.setData2("testtest");

		// insert_data 호출
		dbo.insert_data(bean1);
		dbo.insert_data(bean2);
		
		// update_data 호출
		dbo.update_data(bean3);

		*/
		
		dbo.delete_data(100);
		
		System.out.println("Insert!");
		System.out.println("Update!");
		System.out.println("Delete!");

		atx.close();

	}

}
