package io.murad.cms.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.murad.cms.blog.model.Topic;
import io.murad.cms.blog.repository.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	@Override
	public Topic saveTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	@Override
	public List<Topic> getTopics() {
		return topicRepository.findAll();
	}

}
