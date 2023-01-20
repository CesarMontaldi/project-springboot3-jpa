package com.montaldi.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montaldi.projeto.entities.Order;
import com.montaldi.projeto.repositories.OrderRepository;

@Service 
public class OrderService { 

	@Autowired
	private OrderRepository repository;
	
	// #Metodo para retornar todos usuários da base de dados.
	public List<Order> findAll() {
		return repository.findAll(); 
	}
	
	// #Metodo para retornar usuário da base de dados pelo Id.
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
