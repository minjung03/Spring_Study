package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.beans.StudentBean;

@Controller
public class ScoreController {
	
	@GetMapping("/score")
	public String score(){
		return "score";
	}
	
	
	@PostMapping("/score_re")
	public String submit2(@ModelAttribute StudentBean std, Model model){
		
		model.addAttribute("student", std);
		model.addAttribute("student_sum", std.Sum());
		model.addAttribute("student_avg", std.Avg());
		return "re_score";
	}


}
