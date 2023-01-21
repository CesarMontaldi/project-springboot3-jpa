package com.montaldi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montaldi.projeto.entities.OrderItem;

public interface OrederItemRepository extends JpaRepository<OrderItem, Long>{ 

}
