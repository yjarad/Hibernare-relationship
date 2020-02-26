package com.edu.yog.hibernate.releationship.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

import com.edu.yog.hibernate.releationship.model.Comment;
import com.edu.yog.hibernate.releationship.model.Post;

@Component
public class PostService {
	
	public PostService() {
//		System.out.println("factoryBean" + bean);
//		EntityManager entityManager = bean.getNativeEntityManagerFactory().createEntityManager();
//		System.out.println("factoryBean" + entityManager);
//		entityManager.getTransaction().begin();
//		Post post = new Post("First post");
//		post.addComment(new Comment("My first review"));
//		post.addComment(new Comment("My second review"));
//		post.addComment(new Comment("My third review"));
//		entityManager.persist(post);
//		entityManager.flush();
//		entityManager.getTransaction().commit();
//		System.out.println("Record persited succeesfully ");
	}
}
