package com.example.demo.entity;

import java.util.*;

import javax.persistence.*;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name ;
	 @OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            orphanRemoval = true,
	            mappedBy = "category")
	    private Set<Product> prodcuts = new HashSet<Product>();
	public Category(String name) {
		super();
		this.name = name;
	}
	public Category() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Product> getProdcuts() {
		return prodcuts;
	}
	public void setProdcuts(Set<Product> prodcuts) {
		this.prodcuts = prodcuts;
	}
	

}
