package com.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Products {

	@Id
	@GeneratedValue
	private int prodid;
	private int sellid;
	private String prodname;
	private String proddec;
	private String prodprice;
	
	
	public Products() {
		super();
	}
	public Products(int prodid, int sellid, String prodname, String proddec, String prodprice) {
		super();
		this.prodid = prodid;
		this.sellid = sellid;
		this.prodname = prodname;
		this.proddec = proddec;
		this.prodprice = prodprice;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public int getSellid() {
		return sellid;
	}
	public void setSellid(int sellid) {
		this.sellid = sellid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getProddec() {
		return proddec;
	}
	public void setProddec(String proddec) {
		this.proddec = proddec;
	}
	public String getProdprice() {
		return prodprice;
	}
	public void setProdprice(String prodprice) {
		this.prodprice = prodprice;
	}
	
	
}
