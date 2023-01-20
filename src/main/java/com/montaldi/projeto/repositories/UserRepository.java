package com.montaldi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montaldi.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ 

}
