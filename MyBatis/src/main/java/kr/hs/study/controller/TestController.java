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
public class TestController {
	
	@Autowired
	private dataInterface dataIn;

	@GetMapping("/input_data")
	public String input_data(){
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(DataBean bean){
		dataIn.insert(bean);
		System.out.println(bean.getData1()+" "+bean.getData2()+" "+bean.getData3());
		return "result";
	}
	
   @GetMapping("/read_data")
   public String read_data(Model model) {
	   
      List<DataBean> list = dataIn.select();
      model.addAttribute("list", list);
      System.out.println(list.size());
      return "result2";
   }

	   
	
}
