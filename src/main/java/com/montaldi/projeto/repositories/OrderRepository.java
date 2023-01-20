package com.montaldi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montaldi.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{ 

}
