package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService implements ICrudService<Category, Long>{
	@Autowired
	private CategoryRepository catRep;
		

	@Override
	public List<Category> getAll() {
		return catRep.findAll();
	}

	@Override
	public void add(Category cate) {
		catRep.save(cate);
		
	}

	@Override
	public void update(Category cate) {
		catRep.save(cate);
		
	}

	@Override
	public void delete(Long id) {
	Category cate = new Category();
	cate.setId(id);
	catRep.delete(cate);
		
	}

}
