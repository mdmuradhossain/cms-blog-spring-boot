package io.murad.cms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.murad.cms.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
