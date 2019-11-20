package com.example.demo.service;

import java.util.List;

public interface ICrudService<T ,ID> {
		List<T> getAll();
		void add(T entity);
		void update(T prod);
		void delete(ID id);

}
