package com.pcm708.blog.payloads;

import java.util.HashSet;
import java.util.Set;

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
	
	private String created_at;
	
	private CategoryDto category;

//	private UserDto user;
	
	private Set<CommentDto> comments=new HashSet<>();
}
