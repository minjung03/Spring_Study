package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.support.DaoSupport;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class mainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);


		// TestDAO ��������
		TestDAO dao = atx.getBean(TestDAO.class);
		
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
		dao.insert_data(bean1);
		dao.insert_data(bean2);
		
		// update_data ȣ��
		dao.update_data(bean3);

		// delete_data ȣ��
		// dbo.delete_data(100);
	
		System.out.println("Insert!");
		System.out.println("Update!");
		// System.out.println("Delete!");
		*/

		List<TestBean> list = dao.select_data();
		for(TestBean bean:list) {
			System.out.println("data1 : "+bean.getData1());
			System.out.println("data2 : "+bean.getData2());
		}
	
		atx.close();

	}

}
