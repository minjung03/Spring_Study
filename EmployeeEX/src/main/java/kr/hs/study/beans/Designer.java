package kr.hs.study.beans;

public class Designer implements Employee {
	
	private int intime;
	private int outtime;
	
	public Designer(int intime, int outtime) {
		this.intime = intime;
		this.outtime = outtime;
	}

	public void Checkin() {
		System.out.println("�����̳� "+this.intime+"�� ���");
		
	}

	public void Checkout() {
		System.out.println("�����̳� "+this.outtime+"�� ���");
		
	}

}
