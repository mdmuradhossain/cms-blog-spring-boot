package io.murad.cms.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/topics")
public class TopicController {

	@GetMapping("/createTopic")
	public String createTopic(Model model) {
		return "admin/topic/topicForm";
	}
}
