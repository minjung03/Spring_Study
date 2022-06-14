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
		System.out.println("이름 : "+std.getName().toString());
		System.out.println("국어 : "+std.getKor());
		System.out.println("영어 : "+std.getEng());
		System.out.println("수학 : "+std.getMeth());
		System.out.println("스프링 : "+std.getSpring());
		System.out.println("총점 : "+std.Sum());
		System.out.println("평균 : "+std.Avg());
		return "submit2";
	}


}
