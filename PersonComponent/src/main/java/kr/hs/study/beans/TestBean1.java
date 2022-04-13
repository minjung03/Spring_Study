package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	@Autowired
	private Person p1;
	
	@Autowired
	private Person p2;
	
	public TestBean1(Person p1, Person p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void Print() {
		System.out.println(p1.getName()+", "+p1.getAge()+" "+p2.getName()+", "+p2.getAge());
	}
}
