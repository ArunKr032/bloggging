package com.nontech.blogapis.services;

import com.nontech.blogapis.payloads.CommentDto;

public interface CommentService {
	public CommentDto createComment(CommentDto commentDto, Integer postId);

	public void deleteComment(Integer commentId);
}
