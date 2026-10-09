package uk.ac.westminster.products_api.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.dtos.Product;

@RestController
@RequestMapping
public class ProductController {
    @GetMapping("/product/{id}")
    public Product getProductbyId(@PathVariable int id) {
        return null;
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return product;
    }
}