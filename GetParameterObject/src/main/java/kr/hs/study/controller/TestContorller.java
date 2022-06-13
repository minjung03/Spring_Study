package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

}
