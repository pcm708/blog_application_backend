package com.pcm708.blog.repositories;

import java.util.List;
import java.util.Optional;

import com.pcm708.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{


	@Query("SELECT f.following_id FROM Follow f WHERE f.follower_id = :userId")
	List<Integer> findFollowingIds(@Param("userId") Integer userId);


	Optional<User> findByEmail(String email);
}
