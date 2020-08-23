package io.murad.cms.blog.service;

import java.util.List;

import io.murad.cms.blog.model.Topic;

public interface TopicService{

	public Topic saveTopic(Topic topic);
	public List<Topic> getTopics();
}
