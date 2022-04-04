package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Baseball;
import kr.hs.study.beans.Basketball;
import kr.hs.study.beans.Sports;
import kr.hs.study.beans.vollyball;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Sports obj1 = ctx.getBean("b1", Baseball.class);
		obj1.play();
		obj1.stop();
		
		Sports obj2 = ctx.getBean("b2", vollyball.class);
		obj2.play();
		obj2.stop();
		
		Sports obj3 = ctx.getBean("b3", Basketball.class);
		obj3.play();
		obj3.stop();
		
		ctx.close();

	}

}
