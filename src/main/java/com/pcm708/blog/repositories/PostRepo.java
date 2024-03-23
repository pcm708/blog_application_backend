package com.pcm708.blog.repositories;

import java.util.List;

import com.pcm708.blog.entities.Category;
import com.pcm708.blog.entities.Post;
import com.pcm708.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	@Query("select p from Post p where p.title like :key")
	List<Post> searchByTitle(@Param("key") String title);

	@Query("SELECT p FROM Post p WHERE p.user.user_id IN :userIds")
	List<Post> findByUserIds(@Param("userIds") List<Integer> userIds);

}
