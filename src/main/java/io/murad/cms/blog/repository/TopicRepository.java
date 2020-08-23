package io.murad.cms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.murad.cms.blog.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
