package com.pcm708.blog.services;

import java.util.List;

import com.pcm708.blog.payloads.PostDto;
import com.pcm708.blog.payloads.PostResponse;

public interface PostService {

	//create 

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	PostDto createPost(PostDto postDto,String token,Integer categoryId);
	PostDto createPost(PostDto postDto,String token);

	List<PostDto> fetchPosts(String token);

	//update 

	PostDto updatePost(PostDto postDto, Integer postId);

	// delete

	void deletePost(Integer postId);
	
	//get all posts
	
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	//get single post
	
	PostDto getPostById(Integer postId);
	
	//get all posts by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);

}
