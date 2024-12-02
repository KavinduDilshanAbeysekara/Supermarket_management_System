package com.example.Supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Supermarket.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    //crud
}