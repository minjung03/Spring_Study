package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Controller
public class RegisterController {
	
	@Autowired
	private dataInterface dataIn;
	
	@GetMapping("/register")
	public String register() {
		return "register/register_from";
	}
	
	@PostMapping("/register_re")
	public String register_re(DataBean bean) {
		dataIn.insert(bean);
		System.out.println(bean.getUserid()+" "+bean.getUserpass()+" "+bean.getUsername()+" "+bean.getUseremail()+" "+bean.getUsertel());
		return "register/result";
	}

	@GetMapping("/register_list")
	public String register_list(Model model) {
		 List<DataBean> list = dataIn.select();
	      model.addAttribute("userinfo", list);
	      System.out.println(list.size());
		return "register/register_list";
	}

	   
}
