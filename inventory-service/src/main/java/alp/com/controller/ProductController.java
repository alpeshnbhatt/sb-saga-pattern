package alp.com.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alp.com.entity.Product;
import alp.com.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public Product create(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@GetMapping("/{productId}")
	public Product findById(@PathVariable UUID productId) {
		Optional<Product> opProduct = productService.findProductById(productId);
		return opProduct.isEmpty() ? new Product() : opProduct.get();
	}

	@GetMapping("/test")
	public String helloWord() {
		return "HelloWord" + new Timestamp(new Date().getTime());
	}

}
