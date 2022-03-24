package kr.hs.study.beans;

public class TestBean1 {

	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
	
	public void initMethod() {
		System.out.println("init Method 호출");
	
	}
	
	public void destoryMethod() {
		System.out.println("destory Method 호출");
	}
}
