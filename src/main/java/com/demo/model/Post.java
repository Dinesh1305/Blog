package com.demo.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private UUID id;
	
	
	@Column(nullable=false)
	private String content;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private PostType type;
	
	
	@Column(nullable=false)
	private Integer readingTime;
	
	@CreationTimestamp
	@Column(nullable=false)
	private LocalDateTime createat;
	
	@Column(nullable=false)
	private LocalDateTime updatedAt;

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private User author;
	
	
	
	
	@ManyToOne
	@JoinColumn(name="c_id")
	private Category category;
	
	
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="post_id"),inverseJoinColumns=@JoinColumn(name="tags_id"))
	private Set<Tags>tags;
	@Override
	public int hashCode() {
		return Objects.hash(content, createat, id, readingTime, type, updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(content, other.content) && Objects.equals(createat, other.createat)
				&& Objects.equals(id, other.id) && Objects.equals(readingTime, other.readingTime) && type == other.type
				&& Objects.equals(updatedAt, other.updatedAt);
	}
	
	
	
	
}
