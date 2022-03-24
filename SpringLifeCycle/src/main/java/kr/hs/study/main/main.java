package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class main {

	public static void main(String[] args) {

		  // xml ������ �о �ε��ض� (pom.xml�� ���̺귯���� �־�� import ����!)
		  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		  // �� �ڵ常 �����ص� '�⺻������' ��� (��ü�� �����Ǿ���) -> ��ü ������ �����ڸ� ���� ���� �����ϴϱ�

		  
		  System.out.println();
		 
		  
		
		  //t1�� �����ͼ� �ּ� ���
		  TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		  System.out.println("obj1 : "+ obj1);
		  
		  TestBean1 obj2 = ctx.getBean("t1", TestBean1.class);
		  System.out.println("obj2 : "+ obj2);
		  // ��ü �ּҰ� ���� ��µȴ� -> 'singleton' : �ѹ� �����ϸ� ��� ����Ѵ�
		  
		  
		  System.out.println();
		  
		  
		  
		  // singleton : ��ü�� �ѹ� �����Ǹ� ��� ����ϴ� ��(ex. �ּҰ� ���� ��µ�)
		  TestBean1 obj3 = ctx.getBean("t2", TestBean1.class);
		  System.out.println("obj3 : "+ obj3);
		 
		  // scope="prototype" : getBean() ȣ���� �� ���� ���ο� ��ü �����ϴ� ��
		  TestBean1 obj4 = ctx.getBean("t2", TestBean1.class);
		  System.out.println("obj4 : "+ obj4);
		  
		  
		  
		  System.out.println();
		  
		  
		  // init-method() : ������ ���� �ڵ����� ����Ǵ� �޼��带 �����ϴ� �ɼ�
		  TestBean1 obj5 = ctx.getBean("t3", TestBean1.class);
		  System.out.println("obj5 : "+obj5);
		  
		  // destroy-method() : ��ü �Ҹ� ������ �ڵ����� ����Ǵ� �޼ҵ� (ctx.close �ٷ� ���� ����ȴ�)
		  TestBean1 obj6 = ctx.getBean("t4", TestBean1.class);
		  System.out.println("obj6 : "+obj6);
		 

		  // bean �Ҹ� (container���� �������)
		  ctx.close();
	}

}
