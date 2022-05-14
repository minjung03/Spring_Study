package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		
		TestBean1 obj1 = atx.getBean("java1", TestBean1.class);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		
		atx.close();
	}

}
