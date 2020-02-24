package com.edu.yog.hibernate.releationship.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private BigInteger id;
	private String title;
	private String author;
	@OneToMany(mappedBy = "postId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Comment> comments = new ArrayList<Comment>();

	public Post(String string) {
		this.title = string;
	}

	public Post() {
		// TODO Auto-generated constructor stub
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// Constructors, getters and setters removed for brevity

	public void addComment(Comment comment) {
		comments.add(comment);
		comment.setPostId(this);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
		comment.setPostId(null);
	}
}
