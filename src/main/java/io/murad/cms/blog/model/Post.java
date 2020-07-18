package io.murad.cms.blog.model;
import io.murad.cms.blog.model.Category;
import io.murad.cms.blog.model.Topic;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "post_id")
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Category category;
	
	@ManyToMany(cascade = {
		        CascadeType.PERSIST,
		        CascadeType.MERGE
		    })
		    @JoinTable(name = "post_topic",
		        joinColumns = @JoinColumn(name = "post_id"),
		        inverseJoinColumns = @JoinColumn(name = "topic_id")
		    )
	private List<Topic> topics;
}
