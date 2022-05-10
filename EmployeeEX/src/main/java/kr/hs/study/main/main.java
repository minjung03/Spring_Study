package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.publisher;

public class main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Designer obj1 = ctx.getBean("t1", Designer.class);
		obj1.Checkin();
		obj1.Checkout();
		
		Developer obj2 = ctx.getBean("t2", Developer.class);
		obj2.Checkin();
		obj2.Checkout();
		
		publisher obj3 = ctx.getBean("t3", publisher.class);
		obj3.Checkin();
		obj3.Checkout();
		
		
		ctx.close();

	}

}
