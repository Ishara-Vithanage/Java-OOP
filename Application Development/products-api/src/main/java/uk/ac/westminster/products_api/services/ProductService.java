package uk.ac.westminster.products_api.services;

import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.dtos.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long id = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public String addProduct(Product product) {
        product.setId(id);
        id += 1;
        products.add(product);
        return "Product added successfully";
    }

    public String deleteProduct(Long id) {
        boolean isDeleted = products.removeIf(p -> p.getId().equals(id));
        if (isDeleted) {
            return "Product deleted successfully";
        } else {
            return "Failed to delete the product";
        }
    }
}