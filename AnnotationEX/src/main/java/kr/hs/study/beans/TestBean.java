package kr.hs.study.beans;

public class TestBean {

	private Person p1;
	private Person p2;
	
	public TestBean(Person p1, Person p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void Print() {
		System.out.println(p1.getName()+", "+p1.getAge()+" "+p2.getName()+", "+p2.getAge());
	}
	
}
