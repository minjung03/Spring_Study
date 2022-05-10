package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

	// 테이블 속성 타입과 맞게 변수 작성
	private String userid;
	private String userpass;
	private String username;
	private int userage;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	
	
	
}
