package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Controller
public class HomeController {
	
	@Autowired
	private dataInterface dataIn;
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}

}
