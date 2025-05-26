package eu.sulikdan.shoppingbackend.repository;

import eu.sulikdan.shoppingbackend.entity.ShopOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepo extends CrudRepository<ShopOrder, UUID> {
}
