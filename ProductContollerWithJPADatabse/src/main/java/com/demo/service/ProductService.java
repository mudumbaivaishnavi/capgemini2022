package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Product;

@Service
public interface ProductService {
	// POST
		Product addProductDetails(Product prodcut);

		// GET
		List<Product> getListOfProducts();

		/// PUT
		Product updateProductDetailsBtyId( Product prod, Long id);

		// GET
		Optional<Product> getDetailsById(Long id);

		// delete by id
		void deleteProductById(Long id);


}
