package com.edu.yog.hibernate.releationship.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue
	private BigInteger id;
	private String comment;
	@ManyToOne(fetch = FetchType.LAZY)
	private Post postId;

	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(String review) {
		this.comment = review;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Post getPostId() {
		return postId;
	}

	public void setPostId(Post postId) {
		this.postId = postId;
	}
}
