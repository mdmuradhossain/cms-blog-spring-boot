//package io.murad.cms.blog.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import io.murad.cms.blog.model.Category;
//import io.murad.cms.blog.model.Post;
//import io.murad.cms.blog.model.Topic;
//import io.murad.cms.blog.service.CategoryService;
//import io.murad.cms.blog.service.PostService;
//import io.murad.cms.blog.service.TopicService;
//
//@Controller
//public class FrontController {
//
//	private PostService postService;
//	private CategoryService categoryService;
//	private TopicService topicService;
//
//	@Autowired
//	public FrontController(PostService postService, CategoryService categoryService, TopicService topicService) {
//		this.postService = postService;
//		this.categoryService = categoryService;
//		this.topicService = topicService;
//	}
//
//	@GetMapping
//	public String posts(Model model) {
//		List<Post> posts = postService.getPosts();
//		model.addAttribute("posts",posts);
//		return "front/posts";
//	}
//
//	@GetMapping
//	public String categories(Model model) {
//		List<Category> categories = categoryService.getCategories();
//		model.addAttribute("categories",categories);
//		return "front/categories";
//	}
//
//	@GetMapping
//	public String topics(Model model) {
//		List<Topic> topics = topicService.getTopics();
//		model.addAttribute("topics",topics);
//		return "front/topics";
//	}
//}
