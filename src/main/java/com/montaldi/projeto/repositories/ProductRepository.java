package com.montaldi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montaldi.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ 

}
