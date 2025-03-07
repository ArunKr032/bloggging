package com.nontech.blogapis.payloads;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostResponse {
	
	private List<PostDto> content;
	private Integer pageNumber;
	private Integer pageSize;
	private long totalElements;
	private int totalPages;
	private boolean lastPage;

}
