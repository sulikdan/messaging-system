package eu.sulikdan.shoppingbackend.controller;

import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.repository.ProductRepo;
import eu.sulikdan.shoppingbackend.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/product")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {

    ProductService productService;
    ProductRepo productRepo;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable UUID id) {
        log.info("Get product by id: {}", id);

        return productRepo.findById(id).orElseThrow(()-> new RuntimeException("Product not found with id: " + id));
    }

    @GetMapping("/v2/{id}")
    public ResponseEntity<Product> getProductByIdV2(@PathVariable UUID id) {
        log.info("Get product v2 by id: {}", id);

        return productRepo.findById(id).map(product -> new ResponseEntity<>(product, HttpStatus.OK)).orElseThrow(()-> new RuntimeException("Product not found with id: " + id));
    }

    @PostMapping
    public Product post(@RequestBody Product product) {
        log.info("Post product: {}", product);
        return productRepo.save(product);
    }


    @PutMapping("{id}")
    public Product put(@PathVariable UUID id, @RequestBody Product product) {
        log.info("Put product: {}", product);
        if(!id.equals(product.getId())){
            throw new RuntimeException("Product id mismatch");
        }

        Product foundProduct = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        return productRepo.save(product);
    }


}
