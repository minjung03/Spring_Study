package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TestBean1 {
	
	@Resource
	private DataBean1 data1;
	// 의미 : Container에 동일한(DataBean1) 타입이면서 변수 이름(data1)과 같은 Bean이 있으면 자동 주입(대입)
	
	@Resource
	private DataBean2 data2;
	

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	@PostConstruct // 생성자 실행 후에 자동으로 실행되는 메소드 (init-method() 속성)
	public void PostConstruct_Print() {
		System.out.println("생성자 실행 후 자동으로 실행되는 메소드");
	}
	
	@PreDestroy // 객체 소멸 전(.close())에 실행되는 메소드 (destroy-method() 속성)
	public void PreDestroy_Print() {
		System.out.println("객체 소멸 전에 실행되는 메소드");
	}

}
