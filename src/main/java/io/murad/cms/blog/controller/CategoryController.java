package io.murad.cms.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.murad.cms.blog.model.Category;
import io.murad.cms.blog.service.CategoryService;


@Controller
@RequestMapping("admin/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/createCategory")
	public String createCategory(Model model) {
		Category category = new Category();
		model.addAttribute("category",category);
		return "admin/category/categoryForm";
	}
	
	@PostMapping("/addCategory")
	public String addCategory(@ModelAttribute("category") Category category) {
		categoryService.saveCategory(category);
		return "admin/category/categoryList";
	}
	
	@GetMapping("/categoryList")
	public String displayCategory(Model model) {
		List<Category> categories = categoryService.getCategories();
		model.addAttribute("categories",categories);
		return "admin/category/categoryList";
	}
}
