package com.app.entities;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

public class ProductDetails {
	
	@NotBlank(message = "Name is required")
	@Column(length = 50, nullable = false)
	private String name;
	
	//@NotBlank(message = "Price info is required")
	//@Column(length = 16, nullable = false)
	private double price;
	
	//Specification
	
	@NotBlank(message = "Image path is required")
	@Column(length = 100, nullable = false)
	private String imagePath;
	
	@NotBlank(message = "Description details required")
	@Column(length = 500, nullable = false)
	private String description;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private ProductCategory category;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private ProductBrand brand;
}
