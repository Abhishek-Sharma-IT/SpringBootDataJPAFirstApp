package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	public Product() {
		super();
	}

	public Product(Integer prodId, String prodCode, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}

	public Product(String prodCode, Double prodCost) {
		super();
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	
	
}
