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
			System.out.println("�α��� ����");
			System.out.println(id+" "+pass);
			model.addAttribute("result", "�α��� ����");
		}
		else {
			System.out.println("�α��� ����");
			return "redirect:/login"; // �ǵ��ư���
		}
		return "login/re_login";
	}
	
}
