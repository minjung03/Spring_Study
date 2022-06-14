package kr.hs.study.beans;

public class StudentBean {
	
	private String name;
	private int kor;
	private int eng;
	private int meth;
	private int spring;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMeth() {
		return meth;
	}
	public void setMeth(int meth) {
		this.meth = meth;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	
	public int Sum() {
		return kor+eng+meth+spring;
	}
	
	public double Avg() {
		return Sum()/4;
	}
	
}
