package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class multipliController {

	
	@GetMapping("/multipli")
	public String multipli(){
		return "multipli/multipli";
	}

	
	@PostMapping("/multipli_re")
	public String submit2(int num, Model model){
		String result="";
		for(int i=1; i<=9; i++) {
			result += num+"*"+i+"="+(num*i)+"</br>";
		}
		model.addAttribute("result", result);
		
		return "multipli/re_multipli";
	}
	

}
