package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration // �� ������ ��ü�� �����ϴ� ���� �������� �˷��ִ� �� (���� java ������ ������)
public class BeanConfigClass {

	// java�� ��ü�� �����ϴ� ���� ���� (config.xml�� �Ȱ���)
	

	@Bean  // �Ʒ� ������ �޼��带 �����ؼ� TestBean ��ü �����
	public TestBean1 java1() { // **�� �޼��� �̸��� ��ü �̸��� �ȴ�
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
		return new TestBean1(); // �̷� ������ε� ���� (�͸� ��ü ����)
	} 
	
	
	@Bean(name="test") // ��ü �̸��� �����ϴ� ��
	@Lazy
	@Scope("prototype")
	public TestBean2 java4() {
		TestBean2 t3 = new TestBean2();
		return t3;
	}
	
	
	
}
