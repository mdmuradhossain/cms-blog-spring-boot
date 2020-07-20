package io.murad.cms.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/posts")
public class PostController {

	@GetMapping("/createPost")
	public String createPost(Model model) {
		return "admin/post/postForm";
	}
}
