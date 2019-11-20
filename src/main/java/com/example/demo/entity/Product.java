package com.example.demo.entity;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ref ;
	   private String pname;
		   private String descrip ;
		   private int quantity ;
			   private float price ;
			   @ManyToOne(fetch = FetchType.LAZY)
			    @JoinColumn(name = "category_id", nullable = false)
			    private Category category ;
	   public Category getCategory() {
				return category;
			}
			
	public Product() {
		super();
	}
	public Product(String ref, String pname, String descrip, int quantity, float price,Category cat) {
		super();
		this.ref = ref;
		this.pname = pname;
		this.descrip = descrip;
		this.quantity = quantity;
		this.price = price;
		this.category=cat;
		System.out.print(this.category.getId());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Long getId() {
		return id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
