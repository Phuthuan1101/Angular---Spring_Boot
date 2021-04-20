package com.thuandp.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.thuandp.ecommerce.entity.Product;
import com.thuandp.ecommerce.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
		
		// disable HTTP methods for Product: Put, Post and Delete
		config.getExposureConfiguration() 
			.forDomainType(Product.class)
			.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
			.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		// disable HTTP methods for Product: Put, Post and Delete
				config.getExposureConfiguration() 
					.forDomainType(ProductCategory.class)
					.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
					.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
	
	}

}
