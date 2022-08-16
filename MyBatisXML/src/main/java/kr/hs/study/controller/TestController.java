package kr.hs.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Controller
public class TestController {

	@Autowired
	private dataInterface dataIn;
	
	@GetMapping("/input")
	public String input_form() {
		return "input_form";
	}
	
	@PostMapping("/input_data")
	public String input_data(DataBean bean) {
		dataIn.insert(bean);
		System.out.println(bean.getName()+" "+bean.getAge());
		return "result";
	}

}
