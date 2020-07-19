package io.murad.cms.blog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "topic_id")
	private Long id;
	
	@Column(name = "topic")
	private String topic;
	
	@ManyToMany(targetEntity = Post.class,mappedBy = "topics")
    private List<Post> posts;
}
