package kr.hs.study.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	
	@Autowired
	@Qualifier("uploadPath")
	private String uploadPath; // uploadPath�� �̸��� ���� bean�� �ڵ� ����
	
	
	@GetMapping("/upload")
	public String upload_form(){
		return "/upload/upload_form";
	}
	
	@PostMapping("/upload")
	public ModelAndView re_upload(MultipartFile file, ModelAndView mv) {
		// file : ���ε� �ϴ� ���Ͽ� ���� ��� ������ ������ ����
		
		System.out.println("filename : "+file.getOriginalFilename());
		System.out.println("filename2 : "+file.getName());
		System.out.println("filesize : "+file.getSize());
		System.out.println("filetype : "+file.getContentType());
		
		String savedName = file.getOriginalFilename();
		File f = new File(uploadPath, savedName);
		
		// �̻��� ������ �̻��� �̸��� �츮�� ������ ���ε� ������ �������� �̸����� �̵� (FileCopyUtils)
		try {
			FileCopyUtils.copy(file.getBytes(), f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.setViewName("upload/re_upload");
		mv.addObject("savedname", savedName);
		
		return mv;
	}
	

}
