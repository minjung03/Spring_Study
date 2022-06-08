package kr.hs.study.controller;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ResultController {
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c[] = request.getParameterValues("c");
		
		System.out.println(a+" "+b);
		for(String item : c) {
			System.out.println(item);
		}
		return "result";
	}
	
	
	@GetMapping("/result2/{data1}/{data2}/{data3}")
	public String result2(@PathVariable String data1, @PathVariable String data2, @PathVariable String data3) {
		
		System.out.println(data1+" "+data2+" "+data3);
		return "result";
	
	}

}
