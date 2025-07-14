package com.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category,UUID> {

	@Query("select c from category c left join fetch c.posts")
	List<Category> findAllWithPostCount();
}
