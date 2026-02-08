package com.open_api_generator_demo.org.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open_api_generator_demo.org.generated.controller.ProductsApi;
import com.open_api_generator_demo.org.generated.model.Product;

@RestController
@RequestMapping("/api")
public class ProductController implements ProductsApi{

	@Override
	public ResponseEntity<Product> createProduct(@Valid Product product) {
		// TODO Auto-generated method stub
		return ProductsApi.super.createProduct(product);
	}

	@Override
	public ResponseEntity<Void> deleteProduct(@NotNull Long id) {
		// TODO Auto-generated method stub
		return ProductsApi.super.deleteProduct(id);
	}

	@Override
	public ResponseEntity<List<Product>> getAllProducts() {
		// TODO Auto-generated method stub
		return ProductsApi.super.getAllProducts();
	}

	@Override
	public ResponseEntity<Product> getProductById(@NotNull Long id) {
		// TODO Auto-generated method stub
		return ProductsApi.super.getProductById(id);
	}

	@Override
	public ResponseEntity<Product> updateProduct(@NotNull Long id, @Valid Product product) {
		// TODO Auto-generated method stub
		return ProductsApi.super.updateProduct(id, product);
	}

	
}
