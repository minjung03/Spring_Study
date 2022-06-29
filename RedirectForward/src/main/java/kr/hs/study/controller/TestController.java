package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String redirect() {
		return "redirect:/result";
	}
	
	@GetMapping("/result")
	public String result() {
		return "result";
	}
	
	@GetMapping("/test2")
	public String forward() {
		return "forward:/result";
	}


}
