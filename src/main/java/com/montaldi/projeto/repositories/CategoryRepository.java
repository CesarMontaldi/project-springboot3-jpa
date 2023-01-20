package com.montaldi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montaldi.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{ 

}
