package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class mainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext gtx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/* 주소 출력 간단 예제
		 * TestBean1 obj1 = gtx.getBean("t1", TestBean1.class);
		 * System.out.println("data1 : "+obj1.getData1());
		 * System.out.println("data2 : "+obj1.getData2());
		 */
		
		TestBean2 obj2 = gtx.getBean("t2", TestBean2.class);
		System.out.println("data1 : "+obj2.getData1());
		System.out.println("data2 : "+obj2.getData2());
		
		System.out.println("---------");
		
		TestBean3 obj4 = gtx.getBean("t3", TestBean3.class);
		System.out.println("data1 : "+obj4.getData1());
		System.out.println("data2 : "+obj4.getData2());
		System.out.println("data3 : "+obj4.getData3());
		System.out.println("data4 : "+obj4.getData4());

		gtx.close();
		System.out.println("=====================================================");
			
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		TestBean2 obj3 = atx.getBean("java1", TestBean2.class);
		System.out.println("data1 : "+obj3.getData1());
		System.out.println("data2 : "+obj3.getData2());

		atx.close();

	}

}
