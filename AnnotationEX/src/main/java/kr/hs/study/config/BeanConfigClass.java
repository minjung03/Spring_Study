package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.TestBean;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean t1() {
		return new TestBean(new Person("kim", 30), new Person("lee", 15));
	}
	
}
