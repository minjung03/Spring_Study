package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		// 按眉 积己 汲沥 颇老 : BeanConfigClass.java
		
		
		TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
		System.out.println("obj1 : "+ obj1);
		
		TestBean1 obj2 = ctx.getBean("java2", TestBean1.class);
		System.out.println("obj2 : "+ obj2);
		
		TestBean1 obj3 = ctx.getBean("java3", TestBean1.class);
		System.out.println("obj3 : "+  obj3);
		
		
		System.out.println();
		
		TestBean2 obj4 = ctx.getBean("test", TestBean2.class);
		System.out.println("obj4 : "+  obj4);
		
		ctx.close();
		

	}

}
