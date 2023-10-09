package com.shyam.test.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.test.entity.Product;
import com.shyam.test.repo.ProductRepository;

@Component
public class ProductTestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Product product=new Product(); product.setId(13); product.setName("Laptop");
		 * product.setCost(324324.3432);
		 * 
		 * Product save = repo.save(product); System.out.println(save);
		 */

		/*
		 * Optional<Product> byId = repo.findById(15); if(byId.isPresent()) {
		 * System.out.println(byId.get()); }else {
		 * System.out.println("No Record Found"); }
		 */

		/*
		 * List<Product> findAll = repo.findAll(); for (Product p : findAll) {
		 * System.out.println(p); }
		 */

		/*
		 * long count = repo.count(); System.out.println("No of Records "+count);
		 */
		
		/*
		 * boolean existsById = repo.existsById(45); System.out.println(existsById);
		 */
		
		
		/*
		 * Product p1 = new Product(12, "P1", 3432.34); Product p2 = new Product(14,
		 * "P2", 98789.8); Product p3 = new Product(16, "P3", 997789.8);
		 * 
		 * repo.saveAll(Arrays.asList(p1,p2,p3));
		 */
		 
		
		//repo.deleteById(12);
		 //Product product = repo.findById(13).get();
		//repo.delete(repo.findById(13).get());
		
		//repo.deleteAllById(Arrays.asList(12,14));
		//repo.deleteAll();
		Product product = repo.findById(16).get();
		repo.deleteAll(Arrays.asList(product));
		
	}

}
