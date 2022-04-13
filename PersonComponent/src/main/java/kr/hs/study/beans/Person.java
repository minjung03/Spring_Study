package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	public Person() {
		System.out.println("person의 기본 생성자");
	}

}
