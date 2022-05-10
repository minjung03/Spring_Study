package kr.hs.study.beans;

public class Designer implements Employee {
	
	private int intime;
	private int outtime;
	
	public Designer(int intime, int outtime) {
		this.intime = intime;
		this.outtime = outtime;
	}

	public void Checkin() {
		System.out.println("디자이너 "+this.intime+"시 출근");
		
	}

	public void Checkout() {
		System.out.println("디자이너 "+this.outtime+"시 퇴근");
		
	}

}
