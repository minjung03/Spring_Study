package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // ��Ʈ�ѷ��̴� ����ϴ� ������̼�
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	// get ������� /(��Ʈ)�� �������� �� �Ʒ� �޼��带 �����ض�
	public String home() {
		System.out.println("home");
		
		// return "WEB-INF/views/index.jsp"; // wetapp�� ��Ʈ�� ��� ���� ��ġ�� �����ֱ�
		return "index"; // ViewResolver�� �����Ͽ� ���ϸ� �����ֱ�
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		System.out.println("test");
		return "test";
	}
}
