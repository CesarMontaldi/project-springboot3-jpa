package com.montaldi.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montaldi.projeto.entities.Category;
import com.montaldi.projeto.repositories.CategoryRepository;

@Service 
public class CategoryService { 

	@Autowired
	private CategoryRepository repository;
	
	// #Metodo para retornar todos usuários da base de dados.
	public List<Category> findAll() {
		return repository.findAll(); 
	}
	
	// #Metodo para retornar usuário da base de dados pelo Id.
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
