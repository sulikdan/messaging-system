package eu.sulikdan.shoppingbackend.controller;

import eu.sulikdan.shoppingbackend.entity.Cart;
import eu.sulikdan.shoppingbackend.repository.CartRepo;
import eu.sulikdan.shoppingbackend.service.CartService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/cart")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartController {

    CartService cartService;
    CartRepo cartRepo;


    @GetMapping("{id}")
    public Cart getCartById(@PathVariable UUID id){

        return cartRepo.getCartById(id);
    }


    @PutMapping("{id}")
    public Cart updateCart(@PathVariable UUID id, @Valid @RequestBody Cart data){

        if( !id.equals(data.getId()) ){
            throw new RuntimeException("Provided id in the cart and id doesnt match!");
        }

        Cart foundCart = cartRepo.getCartById(id);
        if( foundCart == null ){
            throw new RuntimeException("Cart not found!");
        }

        log.info("Updating cart with id: {}", id);

        return cartRepo.save(data);
    }


    @PostMapping
    public Cart createCart(@RequestBody Cart data){
        log.info("Creating a new cart{}", data);

        return cartRepo.save(data);
    }




}
