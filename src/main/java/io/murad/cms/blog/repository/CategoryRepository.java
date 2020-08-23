package io.murad.cms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.murad.cms.blog.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
