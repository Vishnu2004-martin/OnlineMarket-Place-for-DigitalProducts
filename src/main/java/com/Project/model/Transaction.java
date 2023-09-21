package com.Project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transaction")

public class Transaction {
	@Id
	@GeneratedValue

	private int traid;
	private int sellid;
	private int cusid;
	private Long traprice;
	
	
	public Transaction() {
		super();
	}
	public Transaction(int traid, int sellid, int cusid, Long traprice) {
		super();
		this.traid = traid;
		this.sellid = sellid;
		this.cusid = cusid;
		this.traprice = traprice;
	}
	public int getTraid() {
		return traid;
	}
	public void setTraid(int traid) {
		this.traid = traid;
	}
	public int getSellid() {
		return sellid;
	}
	public void setSellid(int sellid) {
		this.sellid = sellid;
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public Long getTraprice() {
		return traprice;
	}
	public void setTraprice(Long traprice) {
		this.traprice = traprice;
	} 
	
}
