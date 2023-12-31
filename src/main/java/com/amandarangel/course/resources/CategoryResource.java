package com.amandarangel.course.resources;



import java.net.URI;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amandarangel.course.services.CategoryService;




@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired 
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<com.amandarangel.entities.Category>> findAll() {
		List<com.amandarangel.entities.Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<com.amandarangel.entities.Category> findById(@PathVariable Long id) {
		com.amandarangel.entities.Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}