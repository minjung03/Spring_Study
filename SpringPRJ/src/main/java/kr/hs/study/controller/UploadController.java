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
	private String uploadPath; // uploadPath란 이름을 가진 bean을 자동 주입
	
	
	@GetMapping("/upload")
	public String upload_form(){
		return "/upload/upload_form";
	}
	
	@PostMapping("/upload")
	public ModelAndView re_upload(MultipartFile file, ModelAndView mv) {
		// file : 업로드 하는 파일에 대한 모든 정보를 가지고 있음
		
		System.out.println("filename : "+file.getOriginalFilename());
		System.out.println("filename2 : "+file.getName());
		System.out.println("filesize : "+file.getSize());
		System.out.println("filetype : "+file.getContentType());
		
		String savedName = file.getOriginalFilename();
		File f = new File(uploadPath, savedName);
		
		// 이상한 폴더의 이상한 이름을 우리가 지정한 업로드 폴더레 정상적인 이름으로 이동 (FileCopyUtils)
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
