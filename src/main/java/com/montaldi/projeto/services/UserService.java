package com.montaldi.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montaldi.projeto.entities.User;
import com.montaldi.projeto.repositories.UserRepository;

@Service 
public class UserService {

	@Autowired
	private UserRepository repository;
	
	// #Metodo para retornar todos usuários da base de dados.
	public List<User> findAll() {
		return repository.findAll(); 
	}
	
	// #Metodo para retornar usuário da base de dados pelo Id.
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj); 
	}
	
	public void delete(Long id) {
		repository.deleteById(id); 
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);  
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone()); 
	}
}
