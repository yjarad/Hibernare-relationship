package com.edu.yog.hibernate.releationship.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.edu.yog.hibernate.releationship.config.HiberanteDataSource;
import com.edu.yog.hibernate.releationship.model.Comment;
import com.edu.yog.hibernate.releationship.model.Post;

@Repository
public class PostService {

	@Autowired
 	HiberanteDataSource dataSource; 


	public PostService() {
		try {
			System.out.println(dataSource.entityManagerFactory()+ "containerEntityManagerFactoryBean");
			System.out.println(dataSource.entityManagerFactory().getNativeEntityManagerFactory() + "containerEntityManagerFactoryBean.getNativeEntityManagerFactory()");
			Post post = new Post("First post");
			post.addComment(new Comment("My first review"));
			post.addComment(new Comment("My second review"));
			post.addComment(new Comment("My third review"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
