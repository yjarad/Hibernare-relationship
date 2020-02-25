package com.edu.yog.hibernate.releationship;

import javax.persistence.EntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.edu.yog.hibernate.releationship.model.Comment;
import com.edu.yog.hibernate.releationship.model.Post;

@SpringBootApplication
public class HibernateReleationshipApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HibernateReleationshipApplication.class, args);
		LocalContainerEntityManagerFactoryBean factoryBean = context
				.getBean(LocalContainerEntityManagerFactoryBean.class);
		PlatformTransactionManager manager = context.getBean(PlatformTransactionManager.class);
		System.out.println("factoryBean" + factoryBean);
		EntityManager entityManager = factoryBean.getNativeEntityManagerFactory().createEntityManager();
		System.out.println("factoryBean" + entityManager);
		entityManager.getTransaction().begin();
		Post post = new Post("First post");
		post.addComment(new Comment("My first review"));
		post.addComment(new Comment("My second review"));
		post.addComment(new Comment("My third review"));
		entityManager.persist(post);
		entityManager.flush();
		entityManager.getTransaction().commit();
		System.out.println("Record persited succeesfully ");
	}

}
