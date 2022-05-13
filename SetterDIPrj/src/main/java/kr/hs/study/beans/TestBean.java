package kr.hs.study.beans;

public class TestBean {

	
	private int a;
	private double b;
	private String c;
	
	private DataBean d;
	private DataBean e;


	public TestBean(int a, double b, String c, DataBean d, DataBean e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	public void PrintData() {
		System.out.println("Ãâ·Â : "+a+" "+b+" "+c+" "+d+" "+e);		
	}
	
}
