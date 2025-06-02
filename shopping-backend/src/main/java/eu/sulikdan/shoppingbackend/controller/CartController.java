package eu.sulikdan.shoppingbackend.controller;

import eu.sulikdan.shoppingbackend.entity.Cart;
import eu.sulikdan.shoppingbackend.service.CartService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/cart")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartController {

    CartService cartService;


    @GetMapping("{id}")
    public Cart getCartById(@PathVariable String id){
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @PutMapping("{id}")
    public Cart updateCart(@PathVariable String id, @Valid @RequestBody Cart data){
        throw new UnsupportedOperationException("Not supported yet.");
    }




}
