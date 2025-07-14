package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor	
public class CateogoryController {

	
	
	@GetMapping()
	public ResponseEntity<List<CateogoryDto>> listofCategory(){
		
	}
}
