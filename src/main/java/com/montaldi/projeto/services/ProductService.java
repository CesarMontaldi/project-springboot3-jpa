package com.montaldi.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montaldi.projeto.entities.Product;
import com.montaldi.projeto.repositories.ProductRepository;

@Service 
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	// #Metodo para retornar todos usuários da base de dados.
	public List<Product> findAll() {
		return repository.findAll(); 
	}
	
	// #Metodo para retornar usuário da base de dados pelo Id.
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
