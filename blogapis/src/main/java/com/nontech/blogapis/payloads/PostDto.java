package com.nontech.blogapis.payloads;

import java.util.Date;
import java.util.Set;

import com.nontech.blogapis.entities.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	private Integer postId;

	private String title;

	private String content;

	private String imageName;

	private Date addesDate;
	
	private CategoryDto category;

	private UserDto user;
	
	private Set<CommentDto> comments;

}
