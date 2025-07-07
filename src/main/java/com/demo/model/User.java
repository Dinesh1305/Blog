package com.demo.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID id;
	
	
	
	@Column(unique=true,nullable=false)
	private String email;
	
	
	private String name;
	
	private String password;
	
	@CreationTimestamp
	private Timestamp createdAt;

	@OneToMany(mappedBy="author",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Post> post;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(createdAt, email, id, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	
	
}
