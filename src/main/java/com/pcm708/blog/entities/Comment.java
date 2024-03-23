package com.pcm708.blog.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comments")
@Getter
@Setter
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id")
	private int id;

	@Column(name = "comment_content")
	private String content;

	@Column(name = "created_at")
	private String created_at;

	@Column(name = "modified_at")
	private String modified_at=null;

	@Column(name = "is_active")
	private boolean isActive=true;

	@ManyToOne
	private Post post;

}
