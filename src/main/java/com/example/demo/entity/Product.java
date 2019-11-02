package com.example.demo.entity;

public class Product {
	   public Product() {
		super();
	}
	public Product(String ref, String pname, String descrip, int quantity, float price) {
		super();
		this.ref = ref;
		this.pname = pname;
		this.descrip = descrip;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
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
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
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
	private String ref ;
		   private String pname;
			   private String descrip ;
			   private int quantity ;
				   private float price ;

}
