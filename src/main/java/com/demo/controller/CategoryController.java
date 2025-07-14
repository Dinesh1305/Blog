package com.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.dto.CategoryDto;
import com.demo.services.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor	
public class CategoryController {

	
	
	private final  CategoryService service;
	
	
	@GetMapping()
	public ResponseEntity<List<CategoryDto>> listofCategory(){
		service.listofCategory();
	}
}
