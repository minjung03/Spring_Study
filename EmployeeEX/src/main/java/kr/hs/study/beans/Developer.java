package kr.hs.study.beans;

public class Developer implements Employee {
	
	private int intime;
	private int outtime;
	
	public Developer(int intime, int outtime) {
		this.intime = intime;
		this.outtime = outtime;
	}

	public void Checkin() {
		System.out.println("������ "+this.intime+"�� ���");
		
	}

	public void Checkout() {
		System.out.println("������ "+this.outtime+"�� ���");
		
	}

}

