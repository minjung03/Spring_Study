package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TestBean1 {
	
	@Resource
	private DataBean1 data1;
	// �ǹ� : Container�� ������(DataBean1) Ÿ���̸鼭 ���� �̸�(data1)�� ���� Bean�� ������ �ڵ� ����(����)
	
	@Resource
	private DataBean2 data2;
	

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	@PostConstruct // ������ ���� �Ŀ� �ڵ����� ����Ǵ� �޼ҵ� (init-method() �Ӽ�)
	public void PostConstruct_Print() {
		System.out.println("������ ���� �� �ڵ����� ����Ǵ� �޼ҵ�");
	}
	
	@PreDestroy // ��ü �Ҹ� ��(.close())�� ����Ǵ� �޼ҵ� (destroy-method() �Ӽ�)
	public void PreDestroy_Print() {
		System.out.println("��ü �Ҹ� ���� ����Ǵ� �޼ҵ�");
	}

}
