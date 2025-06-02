package eu.sulikdan.shoppingbackend.controller;

import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/product")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {

    ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping("/v2/{id}")
    public ResponseEntity<Product> getProductByIdV2(@PathVariable String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @PostMapping
    public Product post(@RequestBody Product product) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @PutMapping("{id}")
    public Product put(@PathVariable String id, @RequestBody Product product) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
