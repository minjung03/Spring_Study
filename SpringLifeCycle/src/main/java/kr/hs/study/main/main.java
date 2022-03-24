package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class main {

	public static void main(String[] args) {

		  // xml 파일을 읽어서 로딩해라 (pom.xml에 라이브러리가 있어야 import 가능!)
		  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		  // 위 코드만 실행해도 '기본생성자' 출력 (객체가 생성되었다) -> 객체 생성시 생성자를 제일 먼저 실행하니까

		  
		  System.out.println();
		 
		  
		
		  //t1을 가져와서 주소 출력
		  TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		  System.out.println("obj1 : "+ obj1);
		  
		  TestBean1 obj2 = ctx.getBean("t1", TestBean1.class);
		  System.out.println("obj2 : "+ obj2);
		  // 객체 주소가 같게 출력된다 -> 'singleton' : 한번 생성하면 계속 사용한다
		  
		  
		  System.out.println();
		  
		  
		  
		  // singleton : 객체가 한번 생성되면 계속 사용하는 것(ex. 주소가 같게 출력됨)
		  TestBean1 obj3 = ctx.getBean("t2", TestBean1.class);
		  System.out.println("obj3 : "+ obj3);
		 
		  // scope="prototype" : getBean() 호출할 때 마다 새로운 객체 생성하는 것
		  TestBean1 obj4 = ctx.getBean("t2", TestBean1.class);
		  System.out.println("obj4 : "+ obj4);
		  
		  
		  
		  System.out.println();
		  
		  
		  // init-method() : 생성자 이후 자동으로 실행되는 메서드를 설정하는 옵션
		  TestBean1 obj5 = ctx.getBean("t3", TestBean1.class);
		  System.out.println("obj5 : "+obj5);
		  
		  // destroy-method() : 객체 소멸 이전에 자동으로 실행되는 메소드 (ctx.close 바로 전에 실행된다)
		  TestBean1 obj6 = ctx.getBean("t4", TestBean1.class);
		  System.out.println("obj6 : "+obj6);
		 

		  // bean 소멸 (container에서 사라진다)
		  ctx.close();
	}

}
