package com.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Post;
@Repository
public interface PostRepo extends JpaRepository<Post,UUID> {

}
