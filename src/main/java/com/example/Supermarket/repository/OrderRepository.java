package com.example.Supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Supermarket.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    
}
