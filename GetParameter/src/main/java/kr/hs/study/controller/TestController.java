package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {


	@GetMapping("/test1")
	public String Test1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		System.out.println(data1+" "+data2);
		return "result";
	}
	
	
	@GetMapping("/test2")
	public String Test2(HttpServletRequest request) {
		
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");
		
		System.out.println(data1+" "+data2);
		for(String item : data3) {
			System.out.println(item);
		}
		return "result";
	}
	
	
	@GetMapping("/test3")
	public String Test3(WebRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3 = request.getParameter("data3");
		
		System.out.println(data1+" "+data2+" "+data3);		
		return "result";
	}
	
	
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String Test4(@PathVariable String data1,
						@PathVariable String data2, 
						@PathVariable String data3) {
		
		System.out.println(data1+" "+data2+" "+data3);	
		return "result";
	}
	
	
	@GetMapping("/test5")
	public String test5(@RequestParam int data1, 
						@RequestParam int data2,
						@RequestParam int[] data3) {
		
		System.out.println(data1+" "+data2);
		for(int data : data3) {
			System.out.println(data);
		}
		return "result";
	}
	
}
