package com.nontech.blogapis.services;

import java.util.List;

import com.nontech.blogapis.entities.Post;
import com.nontech.blogapis.payloads.PostDto;
import com.nontech.blogapis.payloads.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	PostDto updatePost(PostDto postDto, Integer postId);

	void deletePost(Integer postId);

	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy);

	PostDto getPostById(Integer postId);

	List<PostDto> getPostsByCategory(Integer categoryId);

	List<PostDto> getPostsByUser(Integer userId);

	List<PostDto> searchPosts(String keyword);

}
