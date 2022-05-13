package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class main {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		
		TestBean obj = ctx.getBean("t1", TestBean.class);
		obj.PrintData();
		
		
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		obj2.PrintData();
		
		ctx.close();

	}

}
