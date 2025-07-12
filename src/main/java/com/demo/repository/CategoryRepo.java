package com.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category,UUID> {

}
