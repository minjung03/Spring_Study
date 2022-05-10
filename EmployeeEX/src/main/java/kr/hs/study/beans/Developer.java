package kr.hs.study.beans;

public class Developer implements Employee {
	
	private int intime;
	private int outtime;
	
	public Developer(int intime, int outtime) {
		this.intime = intime;
		this.outtime = outtime;
	}

	public void Checkin() {
		System.out.println("개발자 "+this.intime+"시 출근");
		
	}

	public void Checkout() {
		System.out.println("개발자 "+this.outtime+"시 퇴근");
		
	}

}

