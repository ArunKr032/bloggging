package com.nontech.blogapis.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontech.blogapis.entities.Comment;
import com.nontech.blogapis.entities.Post;
import com.nontech.blogapis.exceptions.ResourceNotFoundException;
import com.nontech.blogapis.payloads.CommentDto;
import com.nontech.blogapis.repositories.CommentRepo;
import com.nontech.blogapis.repositories.PostRepo;
import com.nontech.blogapis.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		System.out.println(commentDto+"commentDto");
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "post id", postId));
		System.out.println(commentDto+"commentDto");
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		System.out.println(comment+"comment");
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment comment = this.commentRepo.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "commentId", commentId));
		this.commentRepo.delete(comment);

	}

}
