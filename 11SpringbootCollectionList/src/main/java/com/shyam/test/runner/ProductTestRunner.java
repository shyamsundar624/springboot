package com.shyam.test.runner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
		Product p = new Product();
		p.setName("Laptop");

		p.setListData(Arrays.asList("Mouse", "Keyboard", "Pen"));
		
		Set<String> set=new LinkedHashSet<>();
		set.add("S1");
		set.add("S2");
		set.add("S3");
		p.setSetData(set);
		Map<String, String> map=new LinkedHashMap<>();
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		p.setMapData(map);
		repo.save(p);
	}

}
