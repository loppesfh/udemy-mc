package com.udemy.mc.domain.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.mc.domain.entity.Category;
import com.udemy.mc.domain.repository.CategoryRepository;
import com.udemy.mc.domain.service.exception.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	
	
	public Category findById(Long id) {		
		Optional<Category> opt = repository.findById(id);		
		//return  opt.orElse(null);
		return opt.orElseThrow(() -> new ObjectNotFoundException("Ojeto não encontrado! id: " + id + ", Tipo: " 
				+ Category.class.getName()));		
	}

}
