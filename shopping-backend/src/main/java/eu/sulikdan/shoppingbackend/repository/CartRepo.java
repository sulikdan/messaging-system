package eu.sulikdan.shoppingbackend.repository;

import eu.sulikdan.shoppingbackend.entity.Cart;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CartRepo extends CrudRepository<Cart, UUID> {
    Cart getCartById(UUID id);
}
