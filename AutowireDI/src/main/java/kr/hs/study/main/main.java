package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj = ctx.getBean("t1", TestBean1.class);
		System.out.println("data1 : "+obj.getData1());
		System.out.println("data2 : "+obj.getData2());
		System.out.println("data3 : "+obj.getData3());
		
		
		System.out.println();
		
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data4 : "+obj2.getData4());
		System.out.println("data5 : "+obj2.getData5());
		
		
		System.out.println();
		
		
		TestBean3 obj3 = ctx.getBean("t3", TestBean3.class);
		System.out.println("data6 : "+obj3.getData6());
		System.out.println("data7 : "+obj3.getData7());
		System.out.println("data8 : "+obj3.getData8());
		
		ctx.close();

	}

}
