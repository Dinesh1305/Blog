package com.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Category extends JpaRepository<Category,UUID> {

}
