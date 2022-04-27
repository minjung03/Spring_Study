package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class mainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);


		// TestDAO ��������
		TestDAO dbo = atx.getBean(TestDAO.class);

		
		/*
		// TestBean ��ü bean1 ���� 100, spring100 �ֱ�
		TestBean bean1 = new TestBean();
		bean1.setData1(100);
		bean1.setData2("spring100");


		// TestBean ��ü bean2 ���� 200, spring200 �ֱ�
		TestBean bean2 = new TestBean();
		bean2.setData1(200);
		bean2.setData2("spring200");
		
		// TestBean ��ü bean2 ���� 200, spring200 �ֱ�
		TestBean bean3 = new TestBean();
		bean3.setData1(100);
		bean3.setData2("testtest");

		// insert_data ȣ��
		dbo.insert_data(bean1);
		dbo.insert_data(bean2);
		
		// update_data ȣ��
		dbo.update_data(bean3);

		*/
		
		dbo.delete_data(100);
		
		System.out.println("Insert!");
		System.out.println("Update!");
		System.out.println("Delete!");

		atx.close();

	}

}
