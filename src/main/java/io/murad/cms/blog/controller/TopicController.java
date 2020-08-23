package io.murad.cms.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.murad.cms.blog.model.Topic;
import io.murad.cms.blog.service.TopicService;

@Controller
@RequestMapping("admin/topics")
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping("/createTopic")
	public String createTopic(Model model) {
		Topic topic = new Topic();
		model.addAttribute("topic", topic);
		return "admin/topic/topicForm";
	}

	@PostMapping("/addTopic")
	public String addTopic(@ModelAttribute("topic") Topic topic) {
		topicService.saveTopic(topic);
		return "admin/topic/topicList";
	}

	@GetMapping("")
	public String displayTopic(Model model) {
		List<Topic> topics = topicService.getTopics();
		model.addAttribute("topics", topics);
		return "admin/topic/topicList";
	}
}
