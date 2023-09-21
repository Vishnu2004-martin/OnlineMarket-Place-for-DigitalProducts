//package com.Project.model;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
////import jakarta.persistence.JoinColumn;
////import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="customer")
//public class Customers {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//		
//	private int cusid;
//	private String cusname;
//	private String cusemail;
//	private String cuspassword;
//	private String cusnumber;
//	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="fkcustomerid")
//	private List<Products>products;
//	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="fktraid")
//	private List<Transaction>tran;
//	
// 
//	
//	public Customers() {
//		super();
//	}
//
//	public Customers(int cusid, String cusname, String cusemail, String cuspassword, String cusnumber,
//			List<Products> products, List<Transaction> tran) {
//		super();
//		this.cusid = cusid;
//		this.cusname = cusname;
//		this.cusemail = cusemail;
//		this.cuspassword = cuspassword;
//		this.cusnumber = cusnumber;
//		this.products = products;
//		this.tran = tran;
//	}
//
//	public int getCusid() {
//		return cusid;
//	}
//
//	public void setCusid(int cusid) {
//		this.cusid = cusid;
//	}
//
//	public String getCusname() {
//		return cusname;
//	}
//
//	public void setCusname(String cusname) {
//		this.cusname = cusname;
//	}
//
//	public String getCusemail() {
//		return cusemail;
//	}
//
//	public void setCusemail(String cusemail) {
//		this.cusemail = cusemail;
//	}
//
//	public String getCuspassword() {
//		return cuspassword;
//	}
//
//	public void setCuspassword(String cuspassword) {
//		this.cuspassword = cuspassword;
//	}
//
//	public String getCusnumber() {
//		return cusnumber;
//	}
//
//	public void setCusnumber(String cusnumber) {
//		this.cusnumber = cusnumber;
//	}
//
//	public List<Products> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Products> products) {
//		this.products = products;
//	}
//
//	public List<Transaction> getTran() {
//		return tran;
//	}
//
//	public void setTran(List<Transaction> tran) {
//		this.tran = tran;
//	}
//	
//	
//	
//	
//
//	}

package com.Project.model;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customers {
	@Id
	
	private Long id;
	private String username;
	private String email;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customers(Long id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public Customers() {
		super();
	}
    
	
	
}