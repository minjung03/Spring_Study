package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String Test1() {
		System.out.println("test1");
		return "result";
	}
	
	@GetMapping("/sub1/test3")
	public String Test3() {
		System.out.println("test3");
		return "result";
	}
	
	@GetMapping("/sub1/test4")
	public String Test4() {
		System.out.println("test4");
		return "result";
	}

}
