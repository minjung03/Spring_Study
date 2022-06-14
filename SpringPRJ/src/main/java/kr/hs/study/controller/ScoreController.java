package kr.hs.study.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.beans.StudentBean;

@Controller
public class ScoreController {
	
	@GetMapping("/score")
	public String score(){
		return "score";
	}
	
	@PostMapping("/submit2")
	public String submit2(@ModelAttribute StudentBean std){
		System.out.println("�̸� : "+std.getName().toString());
		System.out.println("���� : "+std.getKor());
		System.out.println("���� : "+std.getEng());
		System.out.println("���� : "+std.getMeth());
		System.out.println("������ : "+std.getSpring());
		System.out.println("���� : "+std.Sum());
		System.out.println("��� : "+std.Avg());
		return "submit2";
	}


}
