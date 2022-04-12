package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		
		TestBean1 obj1 = atx.getBean(TestBean1.class);
		System.out.println(obj1.getData3());
		System.out.println(obj1.getData4());
		
		TestBean2 obj2 = atx.getBean(TestBean2.class);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());
		System.out.println(obj2.getData3());
		System.out.println(obj2.getData4());
		
		atx.close();

	}

}
