package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	
	@Autowired // 참조형일 때만 가능하다 (기본형에는 사용 불가능)
	@Qualifier("d1") // 동일한 타입의 객체가 여러개 있을 수 있으므로, 이름을 주어 자동 주입 하게끔
	private DataBean1 data1; // container에 DataBean1의 타입의 Bean이 있으면 그 값을 자동으로 data1에 주입
	
	@Autowired
	@Qualifier("d2") // 이름이 d2인 bean을 찾아서 자동 주입해라
	private DataBean2 data2; // container에 DataBean2의 타입의 Bean이 있으면 그 값을 자동으로 data2에 주입

	
	public DataBean1 getData1() { 
		return data1;
	}
	
	public DataBean2 getData2() {
		return data2;
	}
	
}
