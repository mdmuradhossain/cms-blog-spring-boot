package io.murad.cms.blog.service;

import java.util.List;

import io.murad.cms.blog.model.Category;

public interface CategoryService {

	public Category saveCategory(Category category);
	public List<Category> getCategories();
}
