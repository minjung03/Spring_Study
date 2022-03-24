package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		
		// DI(Dependency Injection : 의존성 투입) 
	    // Constructor DI(생성자를 통한 주입) 
		
		TestBean obj1 = ctx.getBean("t1", TestBean.class);		
		obj1.dataPrint();
		System.out.println();
		
		
		TestBean obj2 = ctx.getBean("t2", TestBean.class);
		obj2.dataPrint();
		System.out.println();
		
		
		TestBean obj3 = ctx.getBean("t3", TestBean.class);
		obj3.dataPrint();
		System.out.println();
		
		
		TestBean obj4 = ctx.getBean("t4", TestBean.class);
		obj4.dataPrint();
		System.out.println();
		
		
		TestBean obj5 = ctx.getBean("t5", TestBean.class);
		obj5.dataPrint();
		System.out.println();
		
		
		
		// 참조형 변수 주입 방법 예제
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.dataPrint();
		System.out.println();
		
		
		TestBean2 obj7 = ctx.getBean("t6", TestBean2.class);
		obj7.dataPrint();
		
		

		
		ctx.close();
	}

}
