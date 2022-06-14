package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class multipliController {

	
	@GetMapping("/multipli")
	public String multipli(){
		return "multipli";
	}
	
	@PostMapping("/submit")
	public String submit(HttpServletRequest http){
		int num = Integer.parseInt(http.getParameter("num"));
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		return "submit";
	}
	

}
