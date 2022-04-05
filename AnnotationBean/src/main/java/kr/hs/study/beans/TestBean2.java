package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	
	@Autowired // �������� ���� �����ϴ� (�⺻������ ��� �Ұ���)
	@Qualifier("d1") // ������ Ÿ���� ��ü�� ������ ���� �� �����Ƿ�, �̸��� �־� �ڵ� ���� �ϰԲ�
	private DataBean1 data1; // container�� DataBean1�� Ÿ���� Bean�� ������ �� ���� �ڵ����� data1�� ����
	
	@Autowired
	@Qualifier("d2") // �̸��� d2�� bean�� ã�Ƽ� �ڵ� �����ض�
	private DataBean2 data2; // container�� DataBean2�� Ÿ���� Bean�� ������ �� ���� �ڵ����� data2�� ����

	
	public DataBean1 getData1() { 
		return data1;
	}
	
	public DataBean2 getData2() {
		return data2;
	}
	
}
