package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

	// 테이블 속성 타입과 맞추어서 주기
	private int data1;
	private String data2;

	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}



}
