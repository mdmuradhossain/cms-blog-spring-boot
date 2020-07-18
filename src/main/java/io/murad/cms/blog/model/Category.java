package io.murad.cms.blog.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private Long id;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@OneToMany(targetEntity = Post.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,
            mappedBy = "category")
	private List<Post> posts;
}
