package com.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Post extends JpaRepository<Post,UUID> {

}
