package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.DataBean2;

@Controller
public class TestContorller {
	
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		System.out.println(data1+ " "+data2);
		
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		System.out.println(data1+ " "+data2);
		for(String data : data3) {
			System.out.printf(data+" ");
		}
		
		return "result";
	}

	
	@GetMapping("/test3")
	public String test3(@ModelAttribute DataBean bean) {
		// bean 객체에 요청된 값을 자동주입(Autowired) 해라
		System.out.println(bean.getData1()+" "+bean.getData2()+ " "+bean.getData3());
		return "result";
	}
	
	
	@GetMapping("/test4")
	public String test3(@ModelAttribute DataBean2 bean) {
		// bean 객체에 요청된 값을 자동주입(Autowired) 해라
		System.out.println(bean.getData1()+" "+bean.getData2());
		for(int num : bean.getData3()) {
			System.out.println(num+" ");
		}
		
		return "result";
	}

}
