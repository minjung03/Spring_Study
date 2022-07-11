package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.StudentBean;

@Controller
public class JoinController {

	@GetMapping("/join")
	public String join(){
		return "join/join";
	}
	
	@PostMapping("/join_re")
	public String re_join(@ModelAttribute Person p, Model model){
		model.addAttribute("person", p);
		return "join/re_join";
	}
	
}
