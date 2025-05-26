package eu.sulikdan.shoppingbackend.repository;

import eu.sulikdan.shoppingbackend.entity.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductModelRepo extends CrudRepository<ProductModel, UUID> {
}
