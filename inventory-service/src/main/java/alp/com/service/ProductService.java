package alp.com.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import alp.com.entity.Product;
import alp.com.repository.ProductRepository;

@Service
public class ProductService {

	ProductRepository productRepositor;

	public ProductService(ProductRepository productRepositor) {
		this.productRepositor = productRepositor;
	}

	public Optional<Product> findProductById(UUID productId) {
		return productRepositor.findById(productId);
	}

	public Product saveProduct(Product product) {
		return productRepositor.save(product);
	}
}
