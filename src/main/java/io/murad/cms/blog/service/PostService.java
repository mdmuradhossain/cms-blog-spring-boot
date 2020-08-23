package io.murad.cms.blog.service;

import java.util.List;

import io.murad.cms.blog.model.Post;

public interface PostService {

	public Post savePost(Post post);
	List<Post> getPosts();
}
