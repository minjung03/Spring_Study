package kr.hs.study.beans;

public class publisher implements Employee {
	
	private int intime;
	private int outtime;
	
	public publisher(int intime, int outtime) {
		this.intime = intime;
		this.outtime = outtime;
	}

	public void Checkin() {
		System.out.println("�ۺ���"+this.intime+"�� ���");
		
	}

	public void Checkout() {
		System.out.println("�ۺ��� "+this.outtime+"�� ���");
		
	}

}
