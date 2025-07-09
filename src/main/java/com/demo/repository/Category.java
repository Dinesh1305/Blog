package com.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Category extends JpaRepository<Category,UUID> {

}
