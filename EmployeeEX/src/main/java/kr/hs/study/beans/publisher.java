package kr.hs.study.beans;

public class publisher implements Employee {
	
	private int intime;
	private int outtime;
	
	public publisher(int intime, int outtime) {
		this.intime = intime;
		this.outtime = outtime;
	}

	public void Checkin() {
		System.out.println("ÆÛºí¸®¼Å"+this.intime+"½Ã Ãâ±Ù");
		
	}

	public void Checkout() {
		System.out.println("ÆÛºí¸®¼Å "+this.outtime+"½Ã Åð±Ù");
		
	}

}
