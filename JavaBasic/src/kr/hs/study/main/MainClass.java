package kr.hs.study.main;

import kr.hs.study.Hello;
import kr.hs.study.HelloWorldEn;
import kr.hs.study.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		Hello en = new HelloWorldKo();
		say_method(en); // static �޼���� ��ü �ȸ��� ��� ����
	}
	
	public static void say_method(Hello hello) {
		hello.sayHello();
	}

}
