package io.murad.cms.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/categories")
public class CategoryController {

	@GetMapping("/createCategory")
	public String createCategory(Model model) {
		return "admin/category/categoryForm";
	}
}
