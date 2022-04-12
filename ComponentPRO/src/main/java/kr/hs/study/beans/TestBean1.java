package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component // 이름 없는 객체를 생성해라 <bean class="kr.hs.study.beans.TestBean1/>과 같은 의미
public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
	}
}
