package io.murad.cms.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {

//	@RequestMapping("/home")
//	public ModelAndView adminHome() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("admin/index");
//		return mv;
//	}
	
	@GetMapping("/home")
	public String adminhome() {
		return "admin/index";
	}
}
