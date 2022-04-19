package kr.hs.study.beans;

public class TestBean1 {

	public void method1() {
		System.out.println("method1 호출");
	}
	
	public void method2() {
		System.out.println("method2 호출");
	}
	
	public void method1(int arg) {
		System.out.println("int형 매개변수 1개 호출");
	}
	
	public void method1(int arg1, int arg2) {
		System.out.println("int형 매개변수 2개 호출");
	}
	
	public void method1(String arg) {
		System.out.println("string형 매개변수 1개 호출");
	}
	
	public void method1(String arg1, String arg2) {
		System.out.println("string형 매개변수 2개 호출");
	}
	
}
