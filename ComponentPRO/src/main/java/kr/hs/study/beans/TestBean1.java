package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component // �̸� ���� ��ü�� �����ض� <bean class="kr.hs.study.beans.TestBean1/>�� ���� �ǹ�
public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1�� �⺻ ������");
	}
}
