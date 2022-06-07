package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sub2") /* 공통되는 부분을 빼준다 */
public class Test2Controller {
	
	@GetMapping("/test5")
	public String Test5() {
		System.out.println("test5");
		return "result";
	}
	
	@GetMapping("/test6")
	public String Test6() {
		System.out.println("test6");
		return "result";
	}
	
	@GetMapping("/test7")
	public String Test7() {
		System.out.println("test7");
		return "result";
	}

}
