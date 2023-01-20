package com.montaldi.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montaldi.projeto.entities.User;
import com.montaldi.projeto.services.UserService;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	// # EndPoint para retornar todos usuários da base de dados.
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list); 
	}
	
	// # EndPoint para retornar usuário da base de dados pelo Id.
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj); 
	}
	
	
	
}
