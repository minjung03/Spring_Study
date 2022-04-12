package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 xml1 = ctx.getBean(TestBean1.class);
		System.out.println(xml1);
		
		TestBean2 xml2 = ctx.getBean("t2", TestBean2.class);
		System.out.println(xml2);
		
		TestBean2 xml3 = ctx.getBean("t3", TestBean2.class);
		System.out.println(xml3);
		
		TestBean3 xml4 = ctx.getBean(TestBean3.class);
		System.out.println(xml4);
		
		ctx.close();
		
		
		System.out.println("====================================================================================");
		
		
		
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = atx.getBean(TestBean1.class);
		System.out.println(java1);
		
		
		TestBean2 java2 = atx.getBean("t2", TestBean2.class);
		System.out.println(java2);
		
		
		TestBean2 java3 = atx.getBean("t3", TestBean2.class);
		System.out.println(java3);
		
		
		TestBean3 java4 = atx.getBean("t4", TestBean3.class);
		System.out.println(java4);
		
		TestBean3 java5 = atx.getBean("t5", TestBean3.class);
		System.out.println(java5);
		
		TestBean3 java6 = atx.getBean("t6", TestBean3.class);
		System.out.println(java6);
		
		
		atx.close();
		
	}

}
