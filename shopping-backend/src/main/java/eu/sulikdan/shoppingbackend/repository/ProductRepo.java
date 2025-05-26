package eu.sulikdan.shoppingbackend.repository;

import eu.sulikdan.shoppingbackend.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepo extends CrudRepository<Product, UUID> {
}
