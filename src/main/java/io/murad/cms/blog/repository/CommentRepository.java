package io.murad.cms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.murad.cms.blog.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
