package com.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
