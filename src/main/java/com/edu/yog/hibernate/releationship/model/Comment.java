package com.edu.yog.hibernate.releationship.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id
	private BigInteger id;
}
