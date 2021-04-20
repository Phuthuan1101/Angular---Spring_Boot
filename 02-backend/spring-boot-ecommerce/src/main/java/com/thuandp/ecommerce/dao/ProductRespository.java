package com.thuandp.ecommerce.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.thuandp.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRespository extends JpaRepository<Product, Long> {

	Page<Product> findByCategoryId(@RequestParam("id") Long id, org.springframework.data.domain.Pageable pageable);
	
}
