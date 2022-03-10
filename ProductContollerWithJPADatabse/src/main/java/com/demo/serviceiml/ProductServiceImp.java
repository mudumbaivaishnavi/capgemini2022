package com.demo.serviceiml;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.productrepositary.ProductRepositary;
import com.demo.service.ProductService;

@Component
public class ProductServiceImp implements ProductService {
	
	@Autowired
	ProductRepositary prodRepos;

	@Override
	public Product addProductDetails(Product product) {
		
		return prodRepos.save(product);


	}

	@Override
	public List<Product> getListOfProducts() {
		List<Product> prodList = prodRepos.findAll();

		return prodList;
	}

	@Override
	public Product updateProductDetailsBtyId(Product prod, Long id) {
		
		
		 prod.setId(id);
         prod.getProductname();
         prod.getColor();
         prod.getSpecification();
         prod.getOs();
		
         
		Product p =prodRepos.save(prod);

		return p;
	}
	
	@Override   
	public Optional<Product> getDetailsById(Long id) {

		Optional<Product> prodigy = prodRepos.findById(id);
		return prodigy;
	}

	@Override
	public void  deleteProductById(Long id) {
		
		prodRepos.deleteById(id);
		
	}

}