package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration // 이 파일은 객체를 생성하는 설정 파일임을 알려주는 것 (많은 java 파일이 있으니)
public class BeanConfigClass {

	// java로 객체를 생성하는 설정 파일 (config.xml과 똑같다)
	

	@Bean  // 아래 나오는 메서드를 실행해서 TestBean 객체 만들기
	public TestBean1 java1() { // **이 메서드 이름이 객체 이름이 된다
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	
	@Bean
	public TestBean1 java3() {
		return new TestBean1(); // 이런 방법으로도 가능 (익명 객체 생성)
	} 
	
	
	@Bean(name="test") // 객체 이름을 지정하는 법
	@Lazy
	@Scope("prototype")
	public TestBean2 java4() {
		TestBean2 t3 = new TestBean2();
		return t3;
	}
	
	
	
}
