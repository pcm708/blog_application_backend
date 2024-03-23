package com.pcm708.blog.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "follows")
@Getter
@Setter
@NoArgsConstructor
public class Follow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "follow_id")
	private Integer followId;

	@Column(name = "follower_id")
	private Integer follower_id;

	@Column(name = "following_id")
	private Integer following_id;

	@Column(name = "following_from")
	private String started_at;
}