package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 컨트롤러이다 명시하는 어노테이션
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	// get 방식으로 /(루트)에 접속했을 때 아래 메서드를 실행해라
	public String home() {
		System.out.println("home");
		
		// return "WEB-INF/views/index.jsp"; // wetapp을 루트로 잡고 파일 위치를 적어주기
		return "index"; // ViewResolver을 설정하여 파일명만 적어주기
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		System.out.println("test");
		return "test";
	}
}
