package io.murad.cms.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.murad.cms.blog.model.Post;
import io.murad.cms.blog.service.CategoryService;
import io.murad.cms.blog.service.PostService;
import io.murad.cms.blog.service.TopicService;

@Controller
@RequestMapping("admin/posts")
public class PostController {

	private CategoryService categoryService;
	private TopicService topicService;
	private PostService postService;
	
	@Autowired
	public PostController(CategoryService categoryService, TopicService topicService, PostService postService) {
		this.categoryService = categoryService;
		this.topicService = topicService;
		this.postService = postService;
	}

	@GetMapping("/createPost")
	public String createPost(Model model) {
		Post post = new Post();
		model.addAttribute("post",post);
		model.addAttribute("categories",categoryService.getCategories());
		model.addAttribute("topics",topicService.getTopics());
		return "admin/post/postForm";
	}
	
	@PostMapping("/addPost")
	public String addPost(@ModelAttribute("post") Post post) {
		postService.savePost(post);
		return "admin/post/postList";
	}
	
	@GetMapping("")
	public String postList(Model model) {
		model.addAttribute("posts",postService.getPosts());
		return "admin/post/postList";
	}
}
