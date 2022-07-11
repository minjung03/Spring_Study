package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(){
		return "login/login";
	}
	
	@PostMapping("/login_re")
	public String re_login(String id, String pass, Model model){
		
		if(id.equals("kim") && pass.equals("1111")) {
			System.out.println("로그인 성공");
			System.out.println(id+" "+pass);
			model.addAttribute("result", "로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
			return "redirect:/login"; // 되돌아가기
		}
		return "login/re_login";
	}
	
}
