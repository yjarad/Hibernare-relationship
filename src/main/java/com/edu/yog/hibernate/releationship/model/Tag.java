package com.edu.yog.hibernate.releationship.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tag {
	@Id
	private BigInteger id;
	private String author;
}
