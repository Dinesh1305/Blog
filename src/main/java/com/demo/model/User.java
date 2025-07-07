package com.demo.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private UUID id;
	
	
	
	@Column(unique=true,nullable=false)
	private String email;
	
	
	private String name;
	
	private String password;
	
	@CreationTimestamp
	private Timestamp createdAt;
	
	
}
