package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1(200, "spring2", new DataBean1()); // java에서의 생성자 DI
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1(); 
		t2.setData1(300);
		t2.setData2("spring2");
		t2.setData3(new DataBean1());
		return t2;
	}
}
