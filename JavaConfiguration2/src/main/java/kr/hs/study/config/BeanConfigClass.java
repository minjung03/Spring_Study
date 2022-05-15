package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration 
public class BeanConfigClass {
	
	@Bean(name="abc")
	@Lazy // getBean() 호출 시에 객체가 생성되게 하기 (기본적으로는 xml 로딩 시에 생성된다)
	@Scope("prototype") // getBean() 호출 시마다 새로운 객체를 생성하게 하기
	public TestBean1 t1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	

}
