package com.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Category;
import com.demo.repository.CategoryRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor	

public class CategoryService {
	
	private final CategoryRepo repo;

	public List<Category> listofCategory()
	{
		return repo.findAllWithPostCount();
	}
}
