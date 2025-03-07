package com.nontech.blogapis.services;

import java.util.List;

import com.nontech.blogapis.payloads.CategoryDto;

public interface CategoryService {

	public CategoryDto createCategory(CategoryDto categoryDto);

	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	public void deleteCategory(Integer categoryId);

	public CategoryDto getCategory(Integer categoryId);

	public List<CategoryDto> getCategories();

}
