package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	//public List<Category> findByCategory(Long id);

}
